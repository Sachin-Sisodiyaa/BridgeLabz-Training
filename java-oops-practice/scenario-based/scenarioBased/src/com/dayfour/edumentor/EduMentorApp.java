/*10. "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.*/



package com.dayfour.edumentor;

import java.util.Scanner;

public class EduMentorApp {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        // Learner input
        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        
        System.out.println("\n\t\tQuiz Started");

        Learner learner = new Learner(name, email, "101");

        // Quiz data
        String[] questions = {
            "Java is platform independent? (yes/no)",
            "Keyword used for inheritance?",
            "How many primitive data types are available in java?",
            "Which keyword is used to declare a class in java",
            "Which method is the entry point for any java application",
            "JVM stands for",
            "Division by zero throws an?"
        };

        String[] answers = { "yes", "extends", "8", "class", "main() method", "java virtual machine", "arithmeticexception"};

        Quiz quiz = new Quiz(questions, answers, "Easy");

        double percentage = quiz.startQuiz();
        learner.setPercentage(percentage);

        // Certificate generation
        learner.generateCertificate();
    }
}
