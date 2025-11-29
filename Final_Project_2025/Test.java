package Final_Project_2025;
import java.io.File;


import java.util.Scanner;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.*;
public class Test {
    public  static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/markiniec/IdeaProjects/data-structures-n-algorithms/Students.txt");
        Scanner st_input = new Scanner(file);
        st_input.useDelimiter( " , ");
        StudentData s = new StudentData ();

        while (st_input.hasNextLine()) {

            String line = st_input.nextLine();
            String[] data = line.split(",");
            s.insert(line);
           System.out.println(line);
        }



        s.displayList();













    }///end main()


}///end class Test


