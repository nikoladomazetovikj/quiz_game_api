package com.nikola.quiz_game.service;

import com.nikola.quiz_game.pojo.Category;
import com.nikola.quiz_game.pojo.Level;
import com.nikola.quiz_game.pojo.Question;
import com.nikola.quiz_game.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultQuestionService implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public Question findOneById(Integer id) {
        return questionRepository.findQuestionById(id);
    }

    @Override
    public Question create(String question, Category category, Level level) {
        Question q = new Question();

        q.setQuestion(question);
        q.setCategory(category);
        q.setLevel(level);

        return questionRepository.save(q);
    }

    @Override
    public Question edit(Integer id, String question, Category category, Level level) {

        Question q = questionRepository.findQuestionById(id);

        if (q != null) {
            q.setQuestion(question);
            q.setLevel(level);
            q.setCategory(category);

            return questionRepository.save(q);
        }

        return null;
    }

    @Override
    public void delete(Integer id) {
        questionRepository.deleteById(id);
    }
}
