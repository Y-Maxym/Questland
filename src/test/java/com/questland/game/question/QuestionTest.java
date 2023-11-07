package com.questland.game.question;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {

    @Test
    void testGetNextQuestions() {
        // Arrange
        Integer[] nextQuestionsArray = {2, 3};
        Question question = new Question(1, "Title", "Заголовок", "Text", "Текст", nextQuestionsArray);

        // Act
        List<Integer> nextQuestions = question.getNextQuestions();

        // Assert
        assertEquals(Arrays.asList(nextQuestionsArray), nextQuestions);
    }

    @Test
    void testQuestionConstructorInitialization() {

        // Arrange
        Integer value = 1;
        String titleEng = "English Title";
        String titleUkr = "Ukrainian Title";
        String textEng = "English Text";
        String textUkr = "Ukrainian Text";
        Integer[] nextQuestions = {2, 3};

        // Act
        Question question = new Question(value, titleEng, titleUkr, textEng, textUkr, nextQuestions);

        // Assert
        assertEquals(value, question.getValue());
        assertEquals(titleEng, question.getTitleEng());
        assertEquals(titleUkr, question.getTitleUkr());
        assertEquals(textEng, question.getTextEng());
        assertEquals(textUkr, question.getTextUkr());
        assertArrayEquals(nextQuestions, question.getNextQuestions().toArray());
    }

    @Test
    void testStringHandling() {
        // Arrange
        Question question = new Question(1, "Title Eng", "Title Ukr", "Text Eng", "Text Ukr");

        // Act
        String titleEng = question.getTitleEng();
        String titleUkr = question.getTitleUkr();
        String textEng = question.getTextEng();
        String textUkr = question.getTextUkr();

        // Assert
        assertEquals("Title Eng", titleEng);
        assertEquals("Title Ukr", titleUkr);
        assertEquals("Text Eng", textEng);
        assertEquals("Text Ukr", textUkr);
    }
}