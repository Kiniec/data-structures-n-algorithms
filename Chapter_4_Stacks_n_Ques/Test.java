package Chapter_4_Stacks_n_Ques;
import java.util.*;

public class Test {
    public static void main ( String [] args ) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        System.out.println(stack.empty());
        stack.search(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }///end main()
}///end class Test
