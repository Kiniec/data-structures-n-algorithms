package Chapter_5_Link_List.Double_Ended_Lists;

public class DLinkedList {
    private Link first;
    private Link last;

    public DLinkedList() {
        first = null;
        last = null;
    }///end DLinkedList

    public boolean isEmpty() {
        return (first == null);
    }///end isEmpty()

    public void insertFirst(int x) {
        Link newLink = new Link(x);
        if(isEmpty()){
            last = newLink;
        }///end if
        newLink.setNext(first);
        first = newLink;
    }///end insertFirst()

    public void insertLast(int x) {
        Link newLink = new Link(x);
        if(isEmpty()){
            first = newLink;
        }///end if
        else {
            last.setNext(newLink);
            last = newLink;
        }
    }///end insertLast()

    public void delteFirst() {
        if(isEmpty()){
            last = null;
        }///end if
        first = first.getNext();
    }///end deleteFirst

    public void displayLast() {
        System.out.println("List (first --> last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.getNext();
        }///end while
    }///end displayLink()
}/// end DLinkList
