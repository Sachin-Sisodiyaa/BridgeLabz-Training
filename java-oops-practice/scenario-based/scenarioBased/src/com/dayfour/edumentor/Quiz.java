package com.dayfour.edumentor;

import java.util.Scanner;

class Quiz {
    // Fields to store quiz data
    private String[] questions;
    private String[] answers;
    private int score;
    private String difficulty;

    // Constructor to initialize questions and answers
    Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    // Method to start the quiz
    public double startQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            System.out.print("Your Answer: ");
            String userAnswer = sc.nextLine();

            // Check answer
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        return (score * 100.0) / questions.length;
    }
}

