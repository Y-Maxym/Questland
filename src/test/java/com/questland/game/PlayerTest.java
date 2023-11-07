package com.questland.game;

import com.questland.game.question.Question;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testPlayerCreation() {
        // Arrange & Act
        Player player = new Player();

        // Assert
        assertNotNull(player);
        assertNotNull(player.getCurrentQuestion());
    }

    @Test
    void testNextQuestion() {
        // Arrange
        Player player = new Player();
        String validAnswer = "2";
        String invalidAnswer = "999"; // Assume 999 is an invalid answer

        // Act
        player.nextQuestion(validAnswer);
        Question validNextQuestion = player.getCurrentQuestion();

        player.nextQuestion(invalidAnswer);
        Question invalidNextQuestion = player.getCurrentQuestion();

        // Assert
        assertNotNull(validNextQuestion);
        assertNotNull(invalidNextQuestion);
        assertNotEquals(validNextQuestion, invalidNextQuestion);
    }


    @Test
    void testGetNextQuestions() {
        // Arrange
        Player player = new Player();

        // Act
        List<Question> nextQuestions = player.getNextQuestions();

        // Assert
        assertNotNull(nextQuestions);
        assertFalse(nextQuestions.isEmpty());
    }

}