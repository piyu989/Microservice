package com.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;

@Service
public class QuizserviceImpl implements QuizService {

	@Autowired
	private QuizRepository repo;
	
	@Autowired
	private QuestionClient client;
	
	@Override
	public Quiz save(Quiz q) {
		// TODO Auto-generated method stub
		return repo.save(q);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		List<Quiz> quizzes=repo.findAll();
		quizzes.stream().map(q -> {
			q.setQuestions(client.getQuestionOfQuiz(q.getId()));
			return q;
		}).collect(Collectors.toList());
		return quizzes;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz q=repo.findById(id).orElseThrow();
		q.setQuestions(client.getQuestionOfQuiz(q.getId()));
		return q;
	}
	
}
