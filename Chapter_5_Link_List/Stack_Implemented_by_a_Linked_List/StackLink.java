package Chapter_5_Link_List.Stack_Implemented_by_a_Linked_List;

public class StackLink {
    private LinkedList list;

    public StackLink() {
        list = new LinkedList();
    }///end constructor

    public void push(int x) {
        list.insertFirst(x);
    }///end push()

    public boolean isEmpty() {
       return list.isEmpty();
    }///end pop

    public int pop() {
        return list.deleteFirst();
    }///end pop

    public void displayStack() {
        System.out.println("Stack (top-->bottom): ");
        list.displayList();
    }///end displayStack
}///end StackLink
