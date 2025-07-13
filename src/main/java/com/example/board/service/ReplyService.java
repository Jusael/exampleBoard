package com.example.board.service;

import java.util.List;

import com.example.board.model.dto.ReplyDto;

public interface ReplyService {

	int write(ReplyDto replyDto);
	
	List<ReplyDto> findSearch(int boardNum);
}
