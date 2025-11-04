package Exams.Exam_2_2025;
import Chapter_4_Stacks_n_Ques.Reverse_words.StackX;

import java.util.Stack;

public class Reverse {
    private String word;
    private String revWord;
    public Reverse(String x) {
        word = x;
        revWord = "";
    }

    public void revNoChar(){
        Stack<Character> theStack= new Stack<Character>();

        for( int j = 0; j<word.length(); j++){  ///to put char in stack
            char temp = word.charAt(j);
            boolean l = Character.isLetter(temp);
            if( l ) {                         ///compare characters to numbers
                theStack.push(temp);
            }///end if
        }///end for

        while(!theStack.isEmpty()){   ///reverse char in stack
            revWord += theStack.pop();
        }///end while

        System.out.println(revWord);

    }///end revNoChar
}///end class Reverse



