package com.spring.ex.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ex.member.domain.MemberVO;
import com.spring.ex.member.repository.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired MemberDAO dao;
	
	// 회원 가입
	@Override
	public void register(MemberVO vo) throws Exception {
		dao.register(vo);
	}
	
	// 회원 가입 - 중복 체크
	@Override
	public int idChk(MemberVO vo)throws Exception {
		int result = dao.idChk(vo);
		return result;
	}
	
	// 로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);
	}
}