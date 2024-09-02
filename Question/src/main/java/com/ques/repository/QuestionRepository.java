package com.ques.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ques.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	List<Question> findByQuizId(Long id);
}
