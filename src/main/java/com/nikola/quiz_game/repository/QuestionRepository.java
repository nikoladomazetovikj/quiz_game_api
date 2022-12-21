package com.nikola.quiz_game.repository;

import com.nikola.quiz_game.pojo.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository <Question, Integer> {

    List<Question> findAl();
    Question findQuestionById(Integer id);
}
