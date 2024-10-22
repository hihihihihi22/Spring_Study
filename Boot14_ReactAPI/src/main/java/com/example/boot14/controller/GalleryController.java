package com.example.boot14.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot14.dto.GalleryDto;
import com.example.boot14.service.GalleryService;

@RestController
public class GalleryController {
	
	@Autowired private GalleryService service;
	
	@DeleteMapping("/gallery/{num}")
	public Map<String, Object> delete(@PathVariable("num") int num){
		service.deleteOne(num);
		
		Map<String, Object> map=new HashMap<>();
		map.put("isSuccess", true);
		return map;
	}
	
	@GetMapping("/gallery/{num}")
	public GalleryDto detail(@PathVariable("num") int num) {
		
		return service.selectOne(num);
	}
	
	//갤러리 목록 요청 처리
	@GetMapping("/gallery")
	public Map<String, Object> getList(@RequestParam int pageNum){
		
		return service.selectPage(pageNum);
	}
	
	@PostMapping("/gallery")
	public Map<String, Object> upload(GalleryDto dto){
		
		service.addToGallery(dto);
		
		Map<String, Object> map=new HashMap<>();
		map.put("isSuccess", true);
		
		return map;
	}
}












