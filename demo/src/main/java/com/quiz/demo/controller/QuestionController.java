package com.quiz.demo.controller;


import org.springframework.web.bind.annotation.RestController;
import com.quiz.demo.model.Question;
import com.quiz.demo.service.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("question")


public class QuestionController{

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestions();
    }

}