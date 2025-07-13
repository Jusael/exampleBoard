package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.model.dto.ReplyDto;
import com.example.board.service.ReplyService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/reply")
public class ReplyController {

	private final ReplyService replyService;
	
	public ReplyController(ReplyService replyService)
	{
		this.replyService = replyService;
	}
	
	@RequestMapping("/write")
	public String insertWrite(ReplyDto replyDto, HttpSession session) {
		
		int result = replyService.write(replyDto);
		System.out.println("result" + result);
		System.out.println("넘겨주는 session값" + session.getAttribute("num"));
		
		return "redirect:/board/detail?num=" + session.getAttribute("num");
	}
	
}
