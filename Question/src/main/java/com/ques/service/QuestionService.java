package com.ques.service;

import java.util.List;

import com.ques.entity.Question;

public interface QuestionService {
	Question save(Question q);
	List<Question> get();
	List<Question> getByQuizId(Long id);
	Question get(Long id);
}
