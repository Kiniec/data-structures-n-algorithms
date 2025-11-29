package Final_Project_2025_V2;

import java.util.Scanner;

public class Student {
    private String name;
    private int  quiz;
    private int assignment;
    private int exams;
    private int project;

    public Student(String n, int q, int a, int e, int p) {
        name = n;
        quiz = q;
        assignment = a;
        exams = e;
        project = p;
    }///end constructor Student

    public String getName() {
        return name;
    }///end getName()

    public int getQuiz() {
        return quiz;
    }///end getQuiz()

    public int getAssignment() {
        return assignment;
    }///end getAssignment()

    public int getExam() {
        return exams;
    }///end getExams()

    public int getProjects() {
        return project;
    }///end getProjects

    public void displayPerson(){
        System.out.print( "Name: " + name + "Quizes Grade: " + quiz + "Assignments Grade: "+ assignment + "Exams Grade: " + exams + "Project Grade: "+ project);
    }///end display
}///end class Student
