package Chapter_5_Link_List;

public class Link {
private int  number;
private int x;
public Link next;

public Link(int x ) {/// constructor
    number = x;
}///end Link

public void setX(){
     x = number ;
    }///emd setX()

public int getX(){
        return x;
}///end get()

 public void setNext(Link x) {
    next = x;
 }///end setNext
    public Link getNext() {
        return next;
    }///end getNext

}///end class Link
