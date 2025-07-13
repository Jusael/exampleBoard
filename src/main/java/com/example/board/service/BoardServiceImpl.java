package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.model.dao.BoardDao;
import com.example.board.model.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<BoardDto> findAll() {
		// TODO Auto-generated method stub
		return boardDao.findAll();
	}

	@Override
	public List<BoardDto> findSearch(String Name) {
		// TODO Auto-generated method stub
		return boardDao.findSearch(Name);
	}

	@Override
	public BoardDto modify(int num) {
		// TODO Auto-generated method stub
		return boardDao.modify(num);
	}

	@Override
	public BoardDto detail(int num) {
		// TODO Auto-generated method stub
		return boardDao.detail(num);
	}

	@Override
	public int write(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardDao.write(boardDto);
	}

	@Override
	public int delete(int num) {
		// TODO Auto-generated method stub
		return boardDao.delete(num);
	}

	@Override
	public int update(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardDao.update(boardDto);
	}

}
