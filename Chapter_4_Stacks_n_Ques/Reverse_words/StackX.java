package Chapter_4_Stacks_n_Ques.Reverse_words;

public class StackX {

    private char[] stackArray;
    private int top;

    public StackX(int size) {

        stackArray = new char [size]; ///create the stack
        top = -1; // set the top to -1
    }///end StackX2

    public void push(char j ){
        stackArray[++top] = j;  ///increment top, insert item
    }///end push()

    public char pop(){
        return stackArray[top--];   /// access item, decrement top
    }///end pop()

    public char peek(){
        return stackArray[top]; ///peek at top of stack
    }///end peek()

    public boolean isEmpty(){
        return top == -1;     ///true if empty
    }///end isEmpty

    public boolean isFull(){
        return (top == stackArray.length-1); /// true if full
    }///end isFull()

}/// end class StackX2
