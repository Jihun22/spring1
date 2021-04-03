package com.ho.JavaSpring1.member.dao;

import com.ho.JavaSpring1.member.Member;

public interface IMemberDao {
	int memberInsert(Member member);
	Member memberSelect(Member member);
	int memberUpdate(Member member);
	int memberDelete(Member member);
}