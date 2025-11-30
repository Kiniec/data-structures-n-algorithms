package Final_Project_2025_V2;

import java.util.Scanner;

public class Student {
    private String name;
    private String  quiz;
    private String assignment;
    private String exams;
    private String  project;

    public Student(String n, String q, String a, String e, String p) {
        /*String n, int q, int a, int e, int p*/
        name = n;
        quiz = q;
        assignment = a;
        exams = e;
        project = p;
    }///end constructor Student

    public String getName() {
        return name;
    }///end getName()

    public String getQuiz() {
        int qq = Integer.parseInt(quiz); ///return integer
        return quiz;
    }///end getQuiz()

    public String getAssignment() {
        int aa = Integer.parseInt(assignment);
        return assignment;
    }///end getAssignment()

    public String getExam() {
       int ee = Integer.parseInt(exams);
        return exams;
    }///end getExams()

    public String  getProjects() {
        int pp = Integer.parseInt(project);
        return project;
    }///end getProjects

    public void displayStudent(){
        System.out.print( "Name: " + name + "Quizes Grade: " + quiz + "Assignments Grade: "+ assignment + "Exams Grade: " + exams + "Project Grade: "+ project);
    }///end display
}///end class Student
