package com.example.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.board.model.dto.BoardDto;


public interface BoardService {

	List<BoardDto> findAll();
	List<BoardDto> findSearch(String Name);
	
	BoardDto modify(int num);
	BoardDto detail(int num);
	
	int write(BoardDto boardDao);
	int delete(int num);
	int update(BoardDto boardDao);
}
