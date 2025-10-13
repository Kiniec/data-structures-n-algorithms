package Chapter_4_Stacks_n_Ques.Delimiter_Matching;

public class StackX {

    private char [] stackArray;
    private int top;

    public StackX(int size) {
        stackArray = new char[size];
        top = -1;
    }///end StackX

    public void push(char j) {
        stackArray[++top] = j; ///put item on top of stack
    }///end push()

    public char pop() {  ///take item form top of stack
        return stackArray[top--];
    }///end pop()

    public boolean isEmpty() {
        return top == -1;
    }///end isEmpty()


} /// end class StackX
