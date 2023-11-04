package com.questland.game;

import com.questland.game.question.Question;
import com.questland.game.repository.Repository;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Player {

    private final Repository repository;
    private final Map<Integer, Question> questions;

    private Question currentQuestion;

    public Player() {
        repository = Repository.getInstance();
        questions = repository.getQuestions();
        currentQuestion = repository.getFirstQuestion();
    }

    public void nextQuestion(String answer) {
        Question question = questions.get(Integer.parseInt(answer));
        if (Objects.isNull(question)) {
            question = repository.getFirstQuestion();
        }
        currentQuestion = question;
    }

    public List<Question> getNextQuestions() {
        List<Integer> nextQuestions = currentQuestion.getNextQuestions();
        return questions.entrySet().stream()
                .filter(entry -> nextQuestions.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }
}
