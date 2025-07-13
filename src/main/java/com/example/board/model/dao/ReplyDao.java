package com.example.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.model.dto.ReplyDto;

@Mapper
public interface ReplyDao {

	int write(ReplyDto repltDto);
	List<ReplyDto> findSearch(int boardNum);
}
