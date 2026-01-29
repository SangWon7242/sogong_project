package com.ysj.sogong.global.init.member;

import com.ysj.sogong.domain.member.dto.MemberDto;
import com.ysj.sogong.domain.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class InitMember
{
  @Bean
  CommandLineRunner commandLineRunnerMember(MemberService memberService)
  {
    return args -> {
      memberService.createMember(new MemberDto(1, "user1", "1234"));
      memberService.createMember(new MemberDto(2, "user2", "1234"));
      memberService.createMember(new MemberDto(3, "user3", "1234"));
    };
  }
}
