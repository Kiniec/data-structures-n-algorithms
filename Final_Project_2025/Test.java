package Final_Project_2025;
import java.io.File;

import java.util.Scanner;

import java.io.FileNotFoundException;


public class Test {
    public  static void main(String[] args) throws  FileNotFoundException {
        File file=new File("/Users/markiniec/IdeaProjects/data-structures-n-algorithms/Students.txt");
        Scanner student_input=new Scanner(file);
       student_input.useDelimiter( ",");
       while (student_input.hasNext()) {
           System.out.println(student_input.nextLine());
       }



    }///end main()


}///end class Test

//String filename = "Final Project 2025 Students.txt";
//Scanner input = new Scanner(new File(filename));
//while (input.hasNextLine()) {
//  System.out.println(input.nextLine());
//}
//System.out.print(input)//;
