package com.nikola.quiz_game.repository;

import com.nikola.quiz_game.pojo.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Integer> {

}
