package com.example.board.model.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.model.dto.MemberDto;


@Mapper
public interface MemberDao{
	void signUp(MemberDto memberDto);
	
	int delete(String id);
	
	MemberDto login(String id, String pw);
	
	MemberDto getMember(String id);
	
	List<MemberDto> getAllMembers();
}
