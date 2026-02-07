package com.ysj.sogong.domain.member.service;

import com.ysj.sogong.domain.member.entity.Member;
import com.ysj.sogong.domain.member.form.MemberForm;
import com.ysj.sogong.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
  private final MemberRepository memberRepository;
  private final PasswordEncoder passwordEncoder;

  public Member createMember(MemberForm memberForm) {
    String encodedPassword = passwordEncoder.encode(memberForm.getPassword());
    Member member = Member.builder()
        .username(memberForm.getUsername())
        .password(encodedPassword)
        .build();
    return memberRepository.save(member);
  }

  public Member createMember(Member member) {
    String encodedPassword = passwordEncoder.encode(member.getPassword());
    member.setPassword(encodedPassword);
    return memberRepository.save(member);
  }

  public Member findMember(String username) {
    return memberRepository.findByUsername(username);
  }

  /**
   * 주어진 아이디가 사용 가능한지 확인
   * 
   * @param username 확인할 아이디
   * @return 사용 가능하면 true, 이미 존재하면 false
   */
  public boolean isUsernameAvailable(String username) {
    return findMember(username) == null;
  }
}
