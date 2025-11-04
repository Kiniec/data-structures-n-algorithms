package Exams.Exam_2_2024;
import java.util.Stack;
public class Palindrome {
    private String word;

    private String revWord;

    public Palindrome(String x) {
        word = x;
        revWord = word;
    }///end constructor Palindrome

    public boolean isPalindrome() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }///end for

        while (!stack.isEmpty()) {
            revWord = revWord + stack.pop();
        }///end while
        if (revWord.equalsIgnoreCase(revWord)) {
            return true;
        }///end if
        return false;
    }///end isPalindrome
}///end class Palindrome
