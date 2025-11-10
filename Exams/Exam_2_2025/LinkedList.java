package Exams.Exam_2_2025;

public class LinkedList {
    private Link first;

    public LinkedList()
    {
        first=null;
    }

    public void insertFirst(String x, double y)
    {
        Link newLink = new Link(x, y);
        newLink.setNext(first);
        first=newLink;
    }

    public void increaseSalary(double amount){
       double s = amount;
       Link c1 = first;
        while (c1 != null) {
            c1.getEmployee().setSalary(c1.getEmployee().getSalary()+s);
            c1 = c1.getNext();
        }///end while loop


   }///end increaseSalary

    public void display(){

        Link current = first;

        while (current != null) {
            current.getEmployee().displayEmployee();
            current = current.getNext();
        }///end while loop
    }///end display


}///end class LinkedinList


