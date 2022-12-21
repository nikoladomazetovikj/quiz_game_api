package com.nikola.quiz_game.pojo;

public class CreateQuestionInput {

    private String question;
    private Category category;
    private Level level;

    public CreateQuestionInput(String question, Category category, Level level) {
        this.question = question;
        this.category = category;
        this.level = level;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
