package Class_Assignments.Assignment_4;

public class Link {
    private Link next;
    private Person p;

    public Link(String x, double y){
        p = new Person(x, y);
        next = null;
    }///end

    public void setNext(Link l){
        next = l;
    }///end setNext

    public Link getNext(){
        return next;
    }///end getNext

    public Person getP(){
        return p;
    }///end getP()

}///end class Link
