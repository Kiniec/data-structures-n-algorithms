package Chapter_5_Link_List.Stack_Implemented_by_a_Linked_List;

public class Link {
    private int number;
    private Link next;

    public Link(int x) {
        number = x;
        next = null;
    }///end Link

    public void displayLink() {
        System.out.println("The number is:  " + number );
    }///end displayLink()

    public int getNumber() {
        return number;
    }///end getNumber()

    public void setNumber(int y) {
        number = y;
    }///end setNumber

    public Link getNext() {
        return next;
    }///end getNumber()

    public void setNext(Link l) {
        next = l;
    }///end setNext()
 }///end
