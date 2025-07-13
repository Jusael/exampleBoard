package com.example.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.model.dto.BoardDto;

@Mapper
public interface BoardDao {

	BoardDto detail(int num);
	BoardDto modify(int num);
	
	List<BoardDto> findAll();
	List<BoardDto> findSearch(String name);
	
	int delete(int num);
	int update(BoardDto boardDto);
	int write(BoardDto boardDto);	
}
