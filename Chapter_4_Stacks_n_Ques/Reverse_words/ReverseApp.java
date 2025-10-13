package Chapter_4_Stacks_n_Ques.Reverse_words;
import java.util.Scanner;


public class ReverseApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String x = input.nextLine();
        Reverser reverse = new Reverser(x);
        String reverseWord = reverse.doRev();
        System.out.println(reverseWord);






    }///end main()
}///end class ReverseApp
