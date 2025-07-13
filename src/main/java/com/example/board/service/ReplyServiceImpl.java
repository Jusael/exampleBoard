package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.model.dao.ReplyDao;
import com.example.board.model.dto.ReplyDto;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	ReplyDao replyDao;
	
	@Override
	public int write(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return replyDao.write(replyDto);
	}

	@Override
	public List<ReplyDto> findSearch(int boardNum) {
		// TODO Auto-generated method stub
		return replyDao.findSearch(boardNum);
	}

}
