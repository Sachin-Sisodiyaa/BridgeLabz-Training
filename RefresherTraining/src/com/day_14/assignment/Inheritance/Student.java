package com.day_14.assignment.Inheritance;

public class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {

        int sum = 0;

        for (int s : testScores) {
            sum += s;
        }

        int p = sum / testScores.length;

        if (p >= 90)
            return 'O';
        else if (p >= 80)
            return 'E';
        else if (p >= 70)
            return 'A';
        else if (p >= 55)
            return 'P';
        else if (p >= 40)
            return 'D';
        else
            return 'T';
    }
}