package com.questland.game.question;

import java.util.*;

public class Question {

    private final Integer value;

    private final String titleEng;
    private final String titleUkr;

    private final String textEng;
    private final String textUkr;

    private final List<Integer> nextQuestions;

    public Question(Integer value, String titleEng, String titleUkr, String textEng, String textUkr, Integer... next) {
        this.value = value;
        this.titleEng = titleEng;
        this.titleUkr = titleUkr;
        this.textEng = textEng;
        this.textUkr = textUkr;
        this.nextQuestions = new ArrayList<>(Arrays.asList(next));
    }

    public Integer getValue() {
        return value;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public String getTitleUkr() {
        return titleUkr;
    }

    public String getTextEng() {
        return textEng;
    }

    public String getTextUkr() {
        return textUkr;
    }

    public List<Integer> getNextQuestions() {
        return nextQuestions;
    }
}