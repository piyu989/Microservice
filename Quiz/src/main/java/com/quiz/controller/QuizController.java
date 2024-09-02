package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Question;
import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService service;

	@PostMapping
	public Quiz save(@RequestBody Quiz q) {
		return service.save(q);
	}
	
	@GetMapping
	public List<Quiz> get(){
		return service.get();
	}
	
	@GetMapping("/{id}")
	public Quiz get(@PathVariable Long id) {
		return service.get(id);
	}
}
