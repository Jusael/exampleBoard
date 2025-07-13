package com.example.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.board.model.dto.BoardDto;

public class BoardDaoImple implements BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "boardMapper.";
	
	@Override
	public BoardDto detail(int num) {
		return sqlSession.selectOne(NAMESPACE + "detail" , num);
	}
	
	@Override
	public BoardDto modify(int num)
	{
		return sqlSession.selectOne(NAMESPACE+ "modify" ,num);
	}
	
	@Override
	public List<BoardDto> findAll(){
		return sqlSession.selectList(NAMESPACE+ "findAll");
	}
	
	@Override
	public List<BoardDto> findSearch(String name){
		return sqlSession.selectList(NAMESPACE+"findSearch",name);
	}
	
	@Override
	public int delete(int num) {
		return sqlSession.delete(NAMESPACE+ "delete",num);
	}
	
	@Override
	public int update(BoardDto boardDto) {
		return sqlSession.update(NAMESPACE+ "update", boardDto);
	}
	
	@Override
	public int write(BoardDto boardDto) {
		return sqlSession.insert(NAMESPACE+ "write", boardDto);
	}
	
}
