package com.example.board.model.dto;

public class ReplyDto {

	private String replyNum;
	private String replyContent;
	private String replyWriter;
	private int boardNum;
	
	public String getReplyNum() {
		return replyNum;
	}
	
	public void setReplyNum(String replyNum) {
		this.replyNum =replyNum; 
	}
	
	
	public String getReplyContent() {
		return this.replyContent;
	}
	
	public void setReplyContent( String replyContent) {
		this.replyContent = replyContent;
	}
	
	public String getReplyWriter() {
		return this.replyWriter; 
	}
	
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	
	public int getBoardNum() {
		return this.boardNum;
	}
	
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
}
