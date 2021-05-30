package com.spring.ex.dao;

import com.spring.ex.vo.MemberVO;

public interface MemberDAO {
	// 회원 가입
	public void register(MemberVO vo) throws Exception;
	
	// 회원 가입 - 중복 체크
	public int idChk(MemberVO vo) throws Exception;
	
	// 로그인
	public MemberVO login(MemberVO vo) throws Exception;
}
