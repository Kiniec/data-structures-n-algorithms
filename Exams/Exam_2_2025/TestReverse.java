package Exams.Exam_2_2025;
import java.util.Scanner;
public class TestReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.next();
        Reverse r = new Reverse(word);
        r.revNoChar();
    }///end main()

}///end class TestReverse
