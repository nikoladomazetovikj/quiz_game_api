package com.nikola.quiz_game.repository;

import com.nikola.quiz_game.pojo.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository <Question, Integer> {

}
