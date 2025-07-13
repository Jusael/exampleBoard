package com.example.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.board.model.dto.ReplyDto;

public class ReplyDaoImple implements ReplyDao {

	@Autowired
	SqlSession sqlSession;
	
	private final String NAMESPACE= "replyMapper.";
	
	@Override
	public int write(ReplyDto replyDto) {
		return sqlSession.insert(NAMESPACE + "write", replyDto);
	}
	
	@Override
	public List<ReplyDto> findSearch(int boardNum)
	{
		return sqlSession.selectList(NAMESPACE + "findSearch", boardNum);
	}
}
