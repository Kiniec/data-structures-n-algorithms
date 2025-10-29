package Chapter_5_Link_List.Simple_Linked_List;

public class LinkedList {

    private static int size = 0;
    private Link first;

    public LinkedList() {
         first = null;
    }///end LinkedList

    public boolean isEmpty() {
    return first == null;
    }///end isEmpty

    public void insertFirst(int x) { ///insert at first
        Link newLink = new Link(x);
        newLink.setNext(first);
        first = newLink;
        size++;
    } ///end insertFirst

   public void deleteFirst() { ///delete an element
       first = first.getNext();
       size--;
   }///end deleteFirst

    public void displayList() { ///used to display an element
        System.out.println("List (first --> Last ): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }///end while loop
    }///end displayList

    public Link find(int key) { ///used to find element with key
        Link current = first;
        while(current.getNumber() != key) {
            if (current.getNext() == null) {
                return null;
            }///end if
            else {
                current = current.getNext();
            }///end else
        }///end while
        return current;
    }///end Link find()

    public int size() {
        return size;
    }///end size()

}///end class LinkedList
