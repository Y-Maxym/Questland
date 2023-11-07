package com.questland.game.repository;

import com.questland.game.question.Question;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    void testRepositoryCreation() {
        // Arrange & Act
        Repository repository = Repository.getInstance();

        // Assert
        assertNotNull(repository);
        assertNotNull(repository.getFirstQuestion());
        assertNotNull(repository.getQuestions());
    }

    @Test
    void testRepositoryInstance() {
        // Arrange & Act
        Repository repository1 = Repository.getInstance();
        Repository repository2 = Repository.getInstance();

        // Assert
        assertNotNull(repository1);
        assertNotNull(repository2);
        assertEquals(repository1, repository2);
    }

    @Test
    void testGetQuestionsAndFirstQuestion() {
        // Arrange
        Repository repository = Repository.getInstance();

        // Act
        Map<Integer, Question> questions = repository.getQuestions();
        Question firstQuestion = repository.getFirstQuestion();

        // Assert
        assertNotNull(questions);
        assertFalse(questions.isEmpty());
        assertNotNull(firstQuestion);
        assertEquals(firstQuestion, questions.get(1)); // Assuming the first question has key 1
    }

}