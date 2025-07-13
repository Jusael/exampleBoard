package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.model.dao.MemberDao;
import com.example.board.model.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private  MemberDao memberDao; 
	
	@Override
	public void singUp(MemberDto memberDto) {
		// TODO Auto-generated method stub
		memberDao.signUp(memberDto);
	}

	@Override
	public MemberDto login(String id, String pw) {
		// TODO Auto-generated method stub
		return memberDao.login(id, pw);
	}

	@Override
	public MemberDto getMemBer(String id) {
		// TODO Auto-generated method stub
		return memberDao.getMember(id);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return memberDao.delete(id);
	}

	@Override
	public List<MemberDto> getAllMember() {
		// TODO Auto-generated method stub
		return memberDao.getAllMembers();
	}

}
