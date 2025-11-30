package Final_Project_2025_V2;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentData {
    private Student [] s;
    private int nElems;

    public StudentData(int maxSize) {
        s  = new Student[maxSize];
    }

    /// end constructor StudentData

    public void insert(String name, String quiz, String assignment, String exam, String project) {
       /* String name, String quiz, String assignment, String exam, String project*/
        /* name, quiz, assignment, exam, project*/
        s[nElems] = new Student(name, quiz, assignment, exam, project  );
        nElems++; /// increment size


    }

    public void display(){     ///displays array contents
        for(int j=0; j<nElems; j++){ ///for each element
            s[j].displayStudent();  ///for each element
            System.out.println(" "); ///display it
        }///end for
    }///end display()


}///end class StudentData
