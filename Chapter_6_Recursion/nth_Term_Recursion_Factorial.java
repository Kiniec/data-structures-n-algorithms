package Chapter_6_Recursion;

import java.util.Scanner;

public class nth_Term_Recursion_Factorial {
   public static void main(String[] args) {
       System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.println( "Factorial = " + answer);
   }///end main()

 public static int factorial(int n) {
       if(n==0){
           return 1;
       }
       else{
           return n*factorial(n-1);
       }//end else
 }///end factorial()
}///end class nth_Term_Recursion_Factorial
