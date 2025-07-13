package com.example.board.model.dto;

public class BoardDto {

	private String id;
	private String name ;
	private String title;
	private String content;
	private int num;
	private String insertDate;
	
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	
	public String getInsertDate() {
		return insertDate;
	}
	
	public void setInsertDate(String insertDate)
	{
		this.insertDate = insertDate;
	}
	
	
}
