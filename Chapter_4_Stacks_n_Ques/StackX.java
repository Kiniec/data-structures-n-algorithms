package Chapter_4_Stacks_n_Ques;

public class StackX {
    private int maxSize; ///size of stack array
    private long [] stackArray;
    private int top; ///top of stack

    public StackX(int s) {           ///constructor
        maxSize = s;                ///set array
        stackArray = new long[maxSize]; ///create array
        top = -1;                       ///no items yet
    }///end of StackX
    public void push(long j){         ///put item on top of stack
        stackArray[++top] = j;        ///increment top, insert item
    }///end of push()

    public long pop(){                ///take item from top of stack
        return stackArray[top--];
        }///end pop()

    public long peek(){                 ///peek at top of
            return stackArray[top];
        }///end peak()

    public boolean isEmpty(){              ///true if stack is empty
            return (top == -1 );
        }///end of isEmpty()

    public boolean isFull(){            ///true if stack is full
        return (top == maxSize-1);
    }///end boolean
}///end StackX
