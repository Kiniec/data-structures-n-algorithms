package Chapter_4_Stacks_n_Ques.Delimiter_Matching;

import java.util.Scanner;

public class BracketApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = input.nextLine();
        BracketChecker checker = new BracketChecker(x);
        checker.check();
    }///end main method
}/// end BracketApp
