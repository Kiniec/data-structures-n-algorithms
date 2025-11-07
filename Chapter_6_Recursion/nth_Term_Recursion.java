package Chapter_6_Recursion;

import java.util.Scanner;

public class nth_Term_Recursion {
   public static void main(String[] args) {
       System.out.print("Enter a term: ");
       Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       int answer = triangle(x);
       System.out.println("The " + x + "th term is " + answer);
   }///end main()

    public static int triangle(int n) {
       if(n==1){
           return 1;
       }///end if
        else {
            return (n+triangle(n-1));
       }///end else
    }///end triangle
}///end class nth Term Recursion
