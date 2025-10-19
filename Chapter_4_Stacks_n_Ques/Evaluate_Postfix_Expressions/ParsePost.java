package Chapter_4_Stacks_n_Ques.Evaluate_Postfix_Expressions;
import java.util.*;

public class ParsePost {
    private String input;

    public ParsePost(String s) {
       input = s;
    }///end ParsePost constructor

    public int doParse() {
        Stack<Integer> theStack = new Stack<>();
        char ch;
        int j;
        int num1, num2, interAns;
        for(j = 0; j < input.length();j++) {
            ch = input.charAt(j);
        if(ch<='0' && ch>='9') {
            theStack.push( (int)( ch-'0'));
        }///end if
        else{
            num2 = theStack.pop();
            num1= theStack.pop();
            switch(ch){
                case '+':
                    interAns = num1 + num2; break;
                case '-':
                    interAns = num1 - num2; break;
                case '*':
                    interAns = num1 * num2; break;
                case '/':
                    interAns = num1 / num2; break;
                default: interAns = 0; break;
            }///end switch
        theStack.push(interAns);
        }///end else
        }///end for
        interAns = theStack.pop();
        return interAns;
    }///end doParse()

}///end class ParsePost
