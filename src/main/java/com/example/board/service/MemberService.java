package com.example.board.service;


import java.util.*;

import org.springframework.stereotype.Service;

import com.example.board.model.dto.MemberDto;


public interface MemberService {

	void singUp(MemberDto memberDto);
	
	MemberDto login(String id, String pw);
	
	MemberDto getMemBer(String id);
	
	int delete (String id);
	
	List<MemberDto> getAllMember();
	
}
