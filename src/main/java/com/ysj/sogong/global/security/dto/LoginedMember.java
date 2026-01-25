package com.ysj.sogong.global.security.dto;

import com.ysj.sogong.domain.member.entity.Member;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Getter
public class LoginedMember extends User
{
  private final int id;

  public LoginedMember(Member member, List<GrantedAuthority> authorities)
  {
    super(member.getUsername(), member.getPassword(), authorities);
    id = member.getId();
  }
}
