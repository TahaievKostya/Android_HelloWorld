package com.example.myfavoritemap;

public class Question {
    private int questionResId;
    private boolean correctAnser;

    public Question(int questionResId, boolean correctAnser) {
        this.questionResId = questionResId;
        this.correctAnser = correctAnser;
    }

    public int getQuestionResId() {
        return questionResId;
    }

    public boolean isCorrectAnser() {
        return correctAnser;
    }
}
