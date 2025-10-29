package Chapter_5_Link_List.Double_Ended_Lists;

public class Link {

    private int number;
    private Link next;

    public Link(int x) {
        number = x;
        next = null;
    }///end constructor Link

    public void displayLink(){
        System.out.println("The number is: " + number );
    }///end displayLink

    public int getNumber() {
        return number;
    }///end getNumber()

    public void setNumber(int y) {
        number = y;
    }///end setNumber()

    public Link getNext() {
        return next;
    }///end getNext

    public void setNext(Link l) {
        next = l ;
    }///end setNumber()


}///end class
