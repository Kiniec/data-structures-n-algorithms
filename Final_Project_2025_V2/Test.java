package Final_Project_2025_V2;

import java.io.FileNotFoundException;


public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        StudentData s = new StudentData(); /// creates new Studnet object here in main

        s.getFile(); /// call method using Student object to get info for file, insert, sort into obeject
        s.display(); /// displays each Student
        s.getCount(); /// diplays the sum of letter grades





    }///end main()
}///end class Test
