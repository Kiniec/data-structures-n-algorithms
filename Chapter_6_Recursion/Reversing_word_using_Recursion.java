package Chapter_6_Recursion;

import java.util.Scanner;

public class Reversing_word_using_Recursion {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String revWord = reverse(word);
        System.out.println("The reversed word is: " + revWord);
    }///end main()

    public static String reverse(String word) {
        if (word.length() == 1){
            return word;
        }///end
        else {
            return word.charAt(word.length()-1) +
                    reverse(word.substring(0, word.length()-1));
        }///end else
    }///end reverse


}///end Reversing_word_using_Recursion
