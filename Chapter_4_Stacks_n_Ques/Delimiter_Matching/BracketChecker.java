package Chapter_4_Stacks_n_Ques.Delimiter_Matching;

public class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }///end BracketChecker

    public void check() {
        boolean error = false;
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);
        for(int j= 0; j<input.length(); j++){
            char ch = input.charAt(j);
            switch(ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
            if (!theStack.isEmpty()){
                char chx = theStack.pop();
                if( (chx == '}' && chx != '{') || (chx == ']' && chx!='[') || (ch==')' && chx!= '(')) ///no match
                {
                    System.out.println("Error: " + ch + " at " + j );
                }///end inter if
            }///end if
            else{ /// stack is empty, missing left delimiter
                    System.out.println("Error: " + ch + " at " + j );
                    error = true;
                }///ende else
                    break;
                    default:
                    break;
            }///end switch
        }///end for
                    ///at this point all characters have been processes
                    ///if the stack has an element, missing right delimiter
        if(!theStack.isEmpty()){
            System.out.println("Error: missing right delimiter");
            error = true;
        }///end if
        if(error==false){
            System.out.println(" No error");
        }///end if
    }///end check()p
}///end class BracketChecker