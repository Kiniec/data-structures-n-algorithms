package Class_Assignments.Assignment_6;

import java.util.Scanner;

public class RecursionMultiplication {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

            System.out.print("Enter the first integer (no1): ");
            int no1 = input.nextInt();
            System.out.print("Enter the second integer (no2): ");
            int no2 = input.nextInt();
            if (no1 <=0 || no2 <=0) {
                System.out.println("Invalid Input");
            }///end if
            else {
                int answer = multiply(no1, no2);
                System.out.print("no1 * no2 = " + answer);
            }



    }///end main()

    public static int multiply(int no1, int no2) {
        if (  no2 == 1 )  {
            return no1;
        }///end if
        else{
            return (  (no1 +  multiply(no1, no2 - 1) ) ) ; ///no2 is used as count down
        }///end else
    }///end multiply()
}///end class RecursionMultiplication
