package Exams.Exam_2_2024;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word ");

        String word = input.nextLine();

        Palindrome p = new Palindrome(word);

        if( p.isPalindrome()){
            System.out.println("It is a palindrome.");
        }///end if
        else{
            System.out.println("The string is not palindrome.");
        }///end else
    }///end main()

}///end class TestPalindrome
