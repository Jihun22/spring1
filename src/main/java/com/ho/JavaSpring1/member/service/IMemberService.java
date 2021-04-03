package com.ho.JavaSpring1.member.service;

import com.ho.JavaSpring1.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	Member memberSearch(Member member);
	Member memberModify(Member member);
	int memberRemove(Member member);
}