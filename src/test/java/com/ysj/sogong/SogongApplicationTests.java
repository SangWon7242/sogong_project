package com.ysj.sogong;

import com.ysj.sogong.domain.member.entity.Member;
import com.ysj.sogong.domain.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SogongApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void t1()
	{
		Member member = memberRepository.findByUsername("fasdfsdfn");
		if(member == null)
		{
			System.out.println("null");
		}
	}
}
