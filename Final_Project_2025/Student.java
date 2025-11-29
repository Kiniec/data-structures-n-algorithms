package Final_Project_2025;

import java.io.File;

public class Student {

    private String stu;
    private String name;
    private int quiz;
    private int assgn;
    private int exam;
    private int project;
    private char grade;
    private Student next;

    public Student( String stu_input ) {
         String stu = stu_input;
        next = null;
    }///end Student constructor

    public String getName() {
        return name;
    }///end getName()

    public void setName( String n) {
        name = n ;
    }///end setName()

    public int getQuiz() {


        return quiz;
    }///end getQuiz()

    public void setQuiz( int q) {
        quiz = q;
    }/// end setQuiz()

    public int getAssgn() {
        return assgn;
    }///end getAssgn()

    public void setAssgn( int a) {
        assgn = a;
    }///end setAssgn()

    public int getExam() {
        return exam;
    }///end exam()

    public void setExam( int e) {

    }///end setExams()

    public int getProject() {
        return project;
    }///end getProject()

    public void setProject( int p) {
        project = p;
    }///end setProject()

    public char getGrade() {
        return grade;
    }///end getGrade()

    public void setGrade( char g) {
        grade = g;
    }///end setGrade

    public void displayLink() {
        System.out.println("Name: " + name + ", " + " Quiz: " + quiz + ", assgn: " + assgn + ", exam: " + exam + ", project: " + project );
    }///end displayLink

    public Student getNext(){
        return next;
    }///end getNext

    public void setNext(Student first) {
        next = first;
    }///end setNext


}///end class Student


