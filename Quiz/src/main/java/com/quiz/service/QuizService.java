package com.quiz.service;

import java.util.List;

import com.quiz.entity.Quiz;

public interface QuizService {
	Quiz save(Quiz q);
	List<Quiz> get();
	Quiz get(Long id);
}
