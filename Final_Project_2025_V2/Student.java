package Final_Project_2025_V2;



public class Student {

    /* variables for class Student*/
    private String n;
    private int  q;
    private int a;
    private int e;
    private int  p;
    private char final_letter_grade;
    private int final_numerical;

    public Student(String name, int quiz, int assignment, int exam, int project) { /// constructor creates object for each student
        n = name;
        q = quiz;
       a = assignment;
          e  = exam;
          p =project;
        gradeCalc();
        finalGrade();
    }///end Student constructor


    ///end constructor Student

    public String getName() {///  method used to get parsed student name
        return n;
    }///end getName

    public char getGrade() { /// method used to get Letter grade. A char is returned
        return final_letter_grade;
    }///end getGrade

    public void finalGrade() { ///  method used to caluculate number and
        if (final_numerical >= 90) {
            final_letter_grade = 'A';
        }///end if
        else if (final_numerical >= 80) {
                final_letter_grade = 'B';
        } ///end else if
        else if (final_numerical >= 70) {
            final_letter_grade = 'C';
        }  ///end else if
        else if (final_numerical >= 60) {
            final_letter_grade = 'D';
        }  ///end else if
        else {
            final_letter_grade = 'F';
        }///end else
    }///end finalGrade

    private void  gradeCalc(){ /// method used to calculate Student's grade
        final_numerical = q  +  a  + e +  p;
    }///end gradeCalc

    public void displayStudent(){ /// method displays students with name and letter
        System.out.print( "Name: " + n + ", " + "Letter Grade: " + final_letter_grade + "\n" );
    }///end display
}///end class Student
