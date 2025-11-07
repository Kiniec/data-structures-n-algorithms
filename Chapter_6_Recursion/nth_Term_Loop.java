package Chapter_6_Recursion;

import java.util.Scanner;

public class nth_Term_Loop {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int x;
        System.out.print("Enter a term: ");
        x = input.nextInt();
        int sum = 0;
        for( int i = 1; i < x + 1; i++) {
            sum = sum + i;
        }///end for
        System.out.println("The " + x + "th term is" + sum);
    }///end main()


} ///end class nth Term Loop
