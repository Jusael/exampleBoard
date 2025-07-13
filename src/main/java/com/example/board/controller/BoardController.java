package com.example.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.model.dto.BoardDto;
import com.example.board.model.dto.ReplyDto;
import com.example.board.service.BoardService;
import com.example.board.service.ReplyService;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/board")
public class BoardController {
	
	
	private final BoardService boardService;
	
	private final ReplyService replyService;
	
	public BoardController(BoardService boardService, ReplyService replyService) {
 		this.boardService = boardService;
		this.replyService = replyService; 
	}
	
	@RequestMapping("/list")
	public String studentList() {
		return "redirect:/board/findAll";
	}
	
	@RequestMapping("/writeView")
	public String boardWriteView() {
		return"board/boardWrite";
	}
	
	@RequestMapping("/write")
	public String boardWrite(BoardDto boardDto)
	{
		boardService.write(boardDto);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/findAll")
	public String findAll(BoardDto boardDto, Model model) {
		
		List<BoardDto> boardList = boardService.findAll();
		model.addAttribute("list", boardList);
		
		return "board/boardList";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("num") int num, Model model) {

		int result = boardService.delete(num);
		System.out.println("BoardController.delete()" + result);
		
		return "redirect:/board/findAll";
	}
	
	@RequestMapping("/modify")
	public String modify(@RequestParam("num")int num, Model model) {

		BoardDto boardDto = boardService.modify(num);
		model.addAttribute("num", num);
		boardDto.setNum(num);
		model.addAttribute("boardDto", boardDto);
		
		return "boaed/boardModify";
	}
	
	@RequestMapping("/update")
	public String update(BoardDto boardDto) {
		int result = boardService.update(boardDto);
		
		return "board/boardDetail";
	}
	
	@RequestMapping("/findSearch")
	public String selectFind(@RequestParam("name") String name, BoardDto boardDto , Model model) {
		
		if(name.equals("") || name ==null )
			return "redirect:/board/findAll";
		
		List<BoardDto> listBoardDto = boardService.findSearch(name);
		
		model.addAttribute("list", listBoardDto);
		
		return "board/boardList";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam("num") int num, Model model, HttpSession session) {
		
		BoardDto boardDto = boardService.detail(num);
		
		model.addAttribute("boardDto", boardDto);
		session.setAttribute("num", num);
		
		List<ReplyDto> listReplyDto = replyService.findSearch(num);
		
		model.addAttribute(listReplyDto);
		
		return "board/boardDetail";
	}
}
