package com.ysj.sogong.domain.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member
{
  private static int lastID;

  private String id;
  private String name;
  private String password;

  static
  {
    lastID = 0;
  }

  public Member(String name, String password)
  {
    id = (++lastID) + "";
    this.name = name;
    this.password = password;
  }
}
