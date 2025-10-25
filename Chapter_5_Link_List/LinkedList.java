package Chapter_5_Link_List;

public class LinkedList {


    private  Link first;
    public LinkedList() {
         first = null;
    }///end LinkedList
    public boolean isEmpty() {
    return first == null;
    }///end isEmpty

        public void insert(int number) {

    Link newLink = new Link(number);
}   ///end insert
    public void setFirst(int number) {
        Link l1 = new Link(number);
        first = l1;
    }///end setForst()


}///end class LinkedList
