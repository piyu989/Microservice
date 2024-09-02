package com.quiz.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String question;
	private Long quizId;
}
