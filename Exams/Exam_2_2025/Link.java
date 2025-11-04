package Exams.Exam_2_2025;

public class Link {
    private Link next;

    private Employee e;

    public Link(String x, double y )
    {
        e = new Employee(x,y);
        next = null;
    }
    public void setNext(Link l)
    {
        next = l;
    }

    public Link getNext()
    {
        return next;
    }

    public Employee getEmployee()
    {
        return e;
    }
}



