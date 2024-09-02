package com.ques.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ques.entity.Question;
import com.ques.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository repo;
	
	@Override
	public Question save(Question q) {
		// TODO Auto-generated method stub
		return repo.save(q);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Question> getByQuizId(Long id) {
		// TODO Auto-generated method stub
		return repo.findByQuizId(id);
	}

	@Override
	public Question get(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}
	
}
