package Chapter_4_Stacks_n_Ques;

public class StackApp {

    public static void main(String[] args)
    {
        StackX theStack = new StackX(10); ///make new stack
        ///push items
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while(!theStack.isEmpty()){        ///until it's empty
            long value = theStack.pop();        ///delte item from stack
            System.out.println(value);           ///display it
            System.out.print("");
        }///end while

    }///end main method

} ///end class StackApp
