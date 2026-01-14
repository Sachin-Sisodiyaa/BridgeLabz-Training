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

import java.util.Scanner;

public class ExamProctorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();
        int choice;

        do {
            System.out.println("\n===== Exam Proctor Menu =====");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. Review Last Question");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Question ID: ");
                    exam.visitQuestion(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    exam.submitAnswer(qId, sc.nextLine());
                    break;

                case 3:
                    exam.reviewLastQuestion();
                    break;

                case 4:
                    exam.evaluateScore();
                    break;

                case 5:
                    System.out.println("Exiting Exam System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
