package Chapter_5_Link_List.Simple_Linked_List;

public class Link {
private int  number;
public Link next;

public Link(int x ) {/// constructor
        number = x;
        next = null;
    }///end Link

    public void displayLink() {
        System.out.println("The number is: " + number);
    }///end displayLink

    public int getNumber(){
        return number;
    }///end get()

    public Link getNext() {
        return next;
    }///end getNext

    public void setNext(Link first ) {
    next = first;
 }///end setNext


}///end class Link
