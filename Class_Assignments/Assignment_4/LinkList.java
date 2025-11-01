package Class_Assignments.Assignment_4;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }///end LinkList

    public void insertFirst(String x, double y){
        Link newLink = new Link(x, y);
        newLink.setNext(first);
        first = newLink;
    }///end

    public void display() { ///used to display an element
        System.out.println("List (first --> last ): ");
        Link current = first;
        while (current != null) {
            current.getP().display();
            current = current.getNext();
        }///end while loop
    }///end displayList

   public Link find(String key) { ///used to find element with key
        Link current = first;
        while(current.getP().getName() != key) {
            if (current.getNext() == null) {
                return null;
            }///end if
            else {
                current = current.getNext();
            }///end else
        }///end while
        return current;
    }///end Link find()


}///end class LinkList
