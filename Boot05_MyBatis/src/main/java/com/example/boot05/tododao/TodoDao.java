package com.example.boot05.tododao;

import java.util.List;
import com.example.boot05.tododto.TodoDto;

public interface TodoDao {
	public List<TodoDto> getList();
	public void insert(TodoDto dto);
	public void delete(int num);
	public TodoDto getData(int num);
	public void update(TodoDto dto);
}
