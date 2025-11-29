package Final_Project_2025_V2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        File f = new File("Students.txt");
        Scanner stuInfo = new Scanner(System.in);
        int maxSize = 100;
        StudentData s = new StudentData(maxSize);

        String sData = null;
        while (stuInfo.hasNextLine()) {
            sData = stuInfo.nextLine();
            String sData_parts = Arrays.toString(sData.split(","));
            String sData_name = sData_parts[0];
            int sData_numbers = Integer.parseInt(sData_parts[1]);

            //String [] sData = stuInfo.nextLine().split(",");

        /*hile (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(","); // Split by comma
        String textPart = parts[0];
        int numberPart = Integer.parseInt(parts[1]);*/

        }
        s.insert();

    }///end main()
}///end class Test
