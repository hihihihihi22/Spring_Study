package com.example.boot05.tododto;

public class TodoDto {

	private int num;
	private String regdate;
	private String todo;
	
	public TodoDto() {}

	public TodoDto(int num, String regdate, String todo) {
		super();
		this.num = num;
		this.regdate = regdate;
		this.todo = todo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	
}
