package Class_Assignments.Assignment_3;


import java.util.Stack;



public class Reverse {

    private String word;

    public Reverse(String w) {
        word = w;

    }///end constructor Reverse

    public void revNoDup() {

        Stack<Character> myStack = new Stack<Character>();
        myStack.push(word.charAt(0));
        char temp = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if(word.charAt(i) != temp) {
                myStack.push(word.charAt(i));
                temp = word.charAt(i);
            }///end if
        }///end for loop

        String rev ="";
            while ( !myStack.isEmpty() ) { ///reverse myStack
                char ch = myStack.pop();
                rev += ch;
            }///end while
        System.out.print(rev);


    }///end revNoDup



}///end class Reverse
