/*11. ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.*/




package com.daythree.examproctor;

import java.util.*;

class ExamProctor {

    Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    ExamProctor() {
        // Predefined correct answers
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    // Visit a question
    void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Submit answer
    void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer.toUpperCase());
        System.out.println("Answer saved for Question " + questionId);
    }

    // Review last visited question
    void reviewLastQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No questions to review.");
            return;
        }

        int lastQuestion = navigationStack.pop();
        System.out.println("Reviewing Question: " + lastQuestion);
    }

    // Evaluate exam score
    void evaluateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (answers.containsKey(qId) &&
                answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }

        System.out.println("Final Score: " + score + "/" + correctAnswers.size());
    }
}

