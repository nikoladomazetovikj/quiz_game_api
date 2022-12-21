package com.nikola.quiz_game.pojo;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "answer_1")
    private String answer_1;

    @Column(name = "answer_2")
    private String answer_2;

    @Column(name = "answer_3")
    private String answer_3;

    @Column(name = "answer_4")
    private String answer_4;

    @Column(name = "answer_1_is_true")
    private boolean answer_1_is_true;


    @Column(name = "answer_2_is_true")
    private boolean answer_2_is_true;

    @Column(name = "answer_3_is_true")
    private boolean answer_3_is_true;

    @Column(name = "answer_4_is_true")
    private boolean answer_4_is_true;

    @OneToOne
    @JoinColumn(name = "question_id")
    private Question question_id;


    public Answer() {
    }

    public Answer(Integer id, String answer_1, String answer_2, String answer_3, String answer_4, boolean answer_1_is_true, boolean answer_2_is_true, boolean answer_3_is_true, boolean answer_4_is_true, Question question_id) {
        this.id = id;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;
        this.answer_1_is_true = answer_1_is_true;
        this.answer_2_is_true = answer_2_is_true;
        this.answer_3_is_true = answer_3_is_true;
        this.answer_4_is_true = answer_4_is_true;
        this.question_id = question_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public void setAnswer_1(String answer_1) {
        this.answer_1 = answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public void setAnswer_2(String answer_2) {
        this.answer_2 = answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public void setAnswer_3(String answer_3) {
        this.answer_3 = answer_3;
    }

    public String getAnswer_4() {
        return answer_4;
    }

    public void setAnswer_4(String answer_4) {
        this.answer_4 = answer_4;
    }

    public boolean isAnswer_1_is_true() {
        return answer_1_is_true;
    }

    public void setAnswer_1_is_true(boolean answer_1_is_true) {
        this.answer_1_is_true = answer_1_is_true;
    }

    public boolean isAnswer_2_is_true() {
        return answer_2_is_true;
    }

    public void setAnswer_2_is_true(boolean answer_2_is_true) {
        this.answer_2_is_true = answer_2_is_true;
    }

    public boolean isAnswer_3_is_true() {
        return answer_3_is_true;
    }

    public void setAnswer_3_is_true(boolean answer_3_is_true) {
        this.answer_3_is_true = answer_3_is_true;
    }

    public boolean isAnswer_4_is_true() {
        return answer_4_is_true;
    }

    public void setAnswer_4_is_true(boolean answer_4_is_true) {
        this.answer_4_is_true = answer_4_is_true;
    }

    public Question getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Question question_id) {
        this.question_id = question_id;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer_1='" + answer_1 + '\'' +
                ", answer_2='" + answer_2 + '\'' +
                ", answer_3='" + answer_3 + '\'' +
                ", answer_4='" + answer_4 + '\'' +
                ", answer_1_is_true=" + answer_1_is_true +
                ", answer_2_is_true=" + answer_2_is_true +
                ", answer_3_is_true=" + answer_3_is_true +
                ", answer_4_is_true=" + answer_4_is_true +
                ", question_id=" + question_id +
                '}';
    }
}
