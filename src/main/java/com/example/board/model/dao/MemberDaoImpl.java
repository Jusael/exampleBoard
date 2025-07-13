package com.example.board.model.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.board.model.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAME_SPACE = "memberMapper.";
	
	@Override
	public void signUp(MemberDto memberDto) {
		sqlSession.insert(NAME_SPACE + "signUp", memberDto);
	}
	
	@Override
	public int delete(String id) {
		return sqlSession.delete(NAME_SPACE  + "delete", id);
	}
	
	@Override	
	public MemberDto login(String id , String pw) {
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		memberDto.setPw(pw);
		
		return sqlSession.selectOne(NAME_SPACE+"login", memberDto);
	}
	
	@Override 
	public MemberDto getMember(String id){
		return sqlSession.selectOne(NAME_SPACE+"getMember",id);
	}
	
	@Override 
	public List<MemberDto> getAllMembers(){
		return sqlSession.selectList(NAME_SPACE + "getAllMembers");
		
	}
}
