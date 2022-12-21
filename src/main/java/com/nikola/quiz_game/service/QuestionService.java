package com.nikola.quiz_game.service;

import com.nikola.quiz_game.pojo.Category;
import com.nikola.quiz_game.pojo.Level;
import com.nikola.quiz_game.pojo.Question;

import java.util.List;

public interface QuestionService {

    List<Question> findAll();
    Question findOneById(Integer id);
    Question create(String question, Category category, Level level);
    Question edit(Integer id, String question, Category category, Level level);
    void delete(Integer id);

}
