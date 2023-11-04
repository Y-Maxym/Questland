package com.questland.game.repository;

import com.questland.game.question.Question;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    private static Repository instance;
    private final Map<Integer, Question> questions;
    private final Question firstQuestion;


    private Repository() {
        Question question = new Question(1, "First Title", "Перший заголовок", "text1 Eng", "Текст1 укр", 2, 3);
        questions = new HashMap<>() {
            {
                put(1, question);
                put(2, new Question(2, "Second Title", "Другий заголовок", "Text2 Eng", "Текст2 укр", 4, 5));
                put(3, new Question(3, "Third title", "Третій заголовок", "text3 eng", "Текст3 укр"));
                put(4, new Question(4, "Four title", "Четвертий заголовок", "text4 eng", "Текст4 укр"));
                put(5, new Question(5, "Five title", "П'ятий заголовок", "text5 eng", "Текст5 укр"));
                put(6, new Question(6, "Six title", "Шостий заголовок", "text6 eng", "Текст6 укр"));
            }
        };
        this.firstQuestion = question;
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public Map<Integer, Question> getQuestions() {
        return questions;
    }

    public Question getFirstQuestion() {
        return firstQuestion;
    }
}