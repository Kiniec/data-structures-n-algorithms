package Class_Assignments.Assignment_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner word_entered = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = word_entered.nextLine();
        Reverse reverser = new Reverse(word);

        reverser.revNoDup();




    }///end main()

}///end class Test
