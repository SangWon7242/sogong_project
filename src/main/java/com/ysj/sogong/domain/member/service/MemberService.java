package com.ysj.sogong.domain.member.service;

import com.ysj.sogong.domain.member.dto.MemberDto;
import com.ysj.sogong.domain.member.entity.Member;
import com.ysj.sogong.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService
{
  private final MemberRepository memberRepository;
  private final PasswordEncoder passwordEncoder;

  public MemberDto createMember(MemberDto memberForm)
  {
    String encodedPassword = passwordEncoder.encode(memberForm.getPassword());
    Member member = Member.builder()
        .username(memberForm.getUsername())
        .password(encodedPassword)
        .build();

    member = memberRepository.save(member);
    MemberDto memberDto = new MemberDto(member);
    return memberDto;
  }
}
