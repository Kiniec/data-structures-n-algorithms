package Chapter_5_Link_List.Stack_Implemented_by_a_Linked_List;

public class Test {
    public static void main(String[] args) {
        StackLink stack = new StackLink();
        stack.push(20);
        stack.push(40);
        stack.displayStack();
        stack.pop();
        stack.displayStack();
    }///end main()
}///end Test
