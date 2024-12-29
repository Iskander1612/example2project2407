package models;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Integer> grades = new ArrayList<>();
    private int studentId;
    private double gpa;
    private static int id = 1;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentId = id++;
    }

    public void addGrade(int mark) {
        grades.add(mark);
    }

    public void calculateGPA() {
        if (grades.isEmpty()) {
            gpa = 0.0;
            return;
        }
        int total = 0;
        for (Integer grade : grades) {
            total += grade;
        }

        int average = total / grades.size();

        if (average < 40) {
            gpa = 1.67;
        } else if (average >= 40 && average <= 59) {
            gpa = 2.0;
        } else if (average >= 60 && average <= 64) {
            gpa = 2.67;
        } else if (average >= 65 && average <= 79) {
            gpa = 3.33;
        } else if (average >= 80 && average <= 99) {
            gpa = 3.79;
        } else if (average == 100) {
            gpa = 4.0;
        }
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID: " + studentId + ", GPA: " + gpa;
    }
}
