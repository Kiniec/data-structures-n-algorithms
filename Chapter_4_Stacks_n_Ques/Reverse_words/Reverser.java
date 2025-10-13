package Chapter_4_Stacks_n_Ques.Reverse_words;

import java_tutorial.WhileLoops;

public class Reverser {
    private String word; ///input string
    public String revWorld; /// output string

    public Reverser(String in ) { ///constructor
        word = in;
        revWorld = "";
    }

    public String doRev(){
        int stackSize = word.length();     ///get max stack size
        StackX theStack = new StackX(stackSize); ///make stack
        for( int j = 0; j<word.length(); j++){
            theStack.push( word.charAt(j));
        }///end for

        while(!theStack.isEmpty()){   ///reverse
           revWorld += theStack.pop();

        }///end while
        return revWorld;
    }/// end doRev()
}///end class Reverser
