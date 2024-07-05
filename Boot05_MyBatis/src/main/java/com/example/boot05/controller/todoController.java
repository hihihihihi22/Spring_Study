package com.example.boot05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class todoController {

	@GetMapping("/todo/list")
	public String list(Model model) {
		return "todo/list";
	}
}
