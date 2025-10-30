package Class_Assignments.Assignment_4;

public class LinkList {

    private Link fist;

    public LinkList() {
        fist = null;
    }///end LinkList

    public void insertFirst(String x, double y){
        Link newLink = new Link(x, y);
        newLink.setNext(fist);
        fist = newLink;
    }///end



}///end class LinkList
