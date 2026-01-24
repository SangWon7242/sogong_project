package com.ysj.sogong.domain.member.repository;

import com.ysj.sogong.domain.member.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository
{
  public static List<Member> members = new ArrayList<>();

  public Member getMember(String name)
  {
    Member findMember = null;
    for(Member member : members)
    {
      if(member.getName().equals(name))
      {
        findMember = member;
      }
    }
    return findMember;
  }
}
