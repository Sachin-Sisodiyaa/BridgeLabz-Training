/*3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting*/



package com.dayseven.eduresults;

import java.util.ArrayList;

public class EduResultsMain {

    public static void main(String[] args) {

        ArrayList<Student> finalList = new ArrayList<>();

        finalList.add(new Student("Madhya Pradesh", "AL101", 55));
        finalList.add(new Student("Madhya Pradesh", "AL102", 60));
        finalList.add(new Student("Madhya Pradesh", "AL103", 68));
        finalList.add(new Student("Madhya Pradesh", "AL104", 75));
        finalList.add(new Student("Madhya Pradesh", "AL105", 82));

        finalList.add(new Student("Uttar Pradesh", "AL201", 50));
        finalList.add(new Student("Uttar Pradesh", "AL202", 58));
        finalList.add(new Student("Uttar Pradesh", "AL203", 65));
        finalList.add(new Student("Uttar Pradesh", "AL204", 72));
        finalList.add(new Student("Uttar Pradesh", "AL205", 90));

        finalList.add(new Student("Rajasthan", "AL301", 45));
        finalList.add(new Student("Rajasthan", "AL302", 55));
        finalList.add(new Student("Rajasthan", "AL303", 63));
        finalList.add(new Student("Rajasthan", "AL304", 77));
        finalList.add(new Student("Rajasthan", "AL305", 88));

        finalList.add(new Student("Maharashtra", "AL401", 52));
        finalList.add(new Student("Maharashtra", "AL402", 61));
        finalList.add(new Student("Maharashtra", "AL403", 69));
        finalList.add(new Student("Maharashtra", "AL404", 80));
        finalList.add(new Student("Maharashtra", "AL405", 95));

        MergeSort.mergeSort(finalList, 0, finalList.size() - 1);

        System.out.println("------------------------------------------------");
        System.out.println("\t\tState-Wise Scores");
        System.out.println("------------------------------------------------");
        System.out.println("\nState\t\t\tRollNo\t\tMarks");
        System.out.println("------------------------------------------------");
        for (Student s : finalList) {
            System.out.println(s.state + "\t\t" + s.rollNo + "\t\t" + s.marks);
        }
    }
}
