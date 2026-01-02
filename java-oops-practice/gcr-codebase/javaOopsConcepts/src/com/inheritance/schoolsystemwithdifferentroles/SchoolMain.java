package com.inheritance.schoolsystemwithdifferentroles;

public class SchoolMain {

    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Aman", 16, "10th Grade");
        Staff st = new Staff("Ravi", 35, "Administration");

        System.out.println("----- Teacher Details -----");
        t.displayRole();

        System.out.println("\n----- Student Details -----");
        s.displayRole();

        System.out.println("\n----- Staff Details -----");
        st.displayRole();
    }
}

