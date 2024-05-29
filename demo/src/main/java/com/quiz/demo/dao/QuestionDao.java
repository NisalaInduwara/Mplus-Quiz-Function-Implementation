package com.quiz.demo.dao;

import org.springframework.stereotype.Repository;

import com.quiz.demo.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
}
