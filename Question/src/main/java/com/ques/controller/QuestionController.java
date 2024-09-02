package com.ques.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ques.entity.Question;
import com.ques.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService service;

	@PostMapping
	public Question save(@RequestBody Question q) {
		return service.save(q);
	}
	
	@GetMapping
	public List<Question> get(){
		return service.get();
	}
	
	@GetMapping("/{id}")
	public Question get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@GetMapping("/quiz/{id}")
	public List<Question> findByQuizId(@PathVariable Long id){
		return service.getByQuizId(id);
	}
}
