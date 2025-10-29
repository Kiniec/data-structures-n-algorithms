package Chapter_5_Link_List.Stack_Implemented_by_a_Linked_List;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }///end constructor LinkedList

    public boolean isEmpty() {
        return first == null;
    }///end isEmpty

    public void insertFirst(int x) {///insert first
        Link newLink = new Link(x);
        newLink.setNext(first);
        first = newLink;
    }///end insertFirst()

    public int deleteFirst() {
        Link temp = first;
        first = first.getNext();
        return (temp.getNumber());
    }///end deleteFirst

    public void displayList() {
        System.out.println("List (first--> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }///end while
    }/// end displayList

    public Link find (int key){
        Link current = first;
        while (current.getNumber() != key) {
            if( current.getNext() == null){
                return null;
            }///end if
            else {
                current = current.getNext();
            }///end else
        }///end while
        return current;
    }///end find()
}/// class LinkedList
