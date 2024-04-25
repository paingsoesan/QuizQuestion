package com.example.quizapp.entity;

import lombok.Data;

@Data
public class QuestionWrapper {

    private int id;
    private String questionTitle;
    private String optional1;
    private String optional2;
    private String optional3;
    private String optional4;

    public QuestionWrapper(int id, String questionTitle, String optional1, String optional2, String optional3, String optional4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.optional1 = optional1;
        this.optional2 = optional2;
        this.optional3 = optional3;
        this.optional4 = optional4;
    }
}
