package com.ysj.sogong.global.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig
{
  @Bean
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
            .requestMatchers("/member/join", "/member/login", "/home").permitAll()
            .anyRequest().authenticated())
        .formLogin(form -> form
            .loginPage("/member/login")
            .loginProcessingUrl("/member/login")
            .defaultSuccessUrl("/member/myPage")
            .permitAll());
    return http.build();
  }

  @Bean
    // 비밀번호 암호와 검증
    // 인증 시 암호화된 비밀번호를 비교
    // Bcrypt 알고리즘 사용
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
    return authenticationConfiguration.getAuthenticationManager();
  }
}
