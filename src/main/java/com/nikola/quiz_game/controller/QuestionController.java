package com.nikola.quiz_game.controller;

import com.nikola.quiz_game.pojo.*;
import com.nikola.quiz_game.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> getAll() {
        return questionService.findAll();
    }

    @GetMapping("/questions/{id}")
    public Question getOneById(@PathVariable Integer id) {
        return questionService.findOneById(id);
    }

    @PostMapping("/questions")
    public Question create(@RequestBody CreateQuestionInput input) {
        String question = input.getQuestion();
        // TODO: do not hardcode categories
        return questionService.create(question, Category.SPORT, Level.EASY);
    }

    @PutMapping("/questions/{id}")
    public Question edit(@PathVariable Integer id, @RequestBody EditQuestionInput input) {
        String question = input.getQuestion();
        //TODO: do not hardcode values
        return questionService.edit(id, question, Category.SPORT, Level.EASY);
    }

    @DeleteMapping("/questions/{id}")
    public void delete(@PathVariable Integer id) {
        questionService.delete(id);
    }



}
