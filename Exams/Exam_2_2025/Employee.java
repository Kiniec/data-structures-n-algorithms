package Exams.Exam_2_2025;

public class Employee {
    private String name;
    private double salary;
    public Employee(String x, double y) {
        name = x;
        salary = y;
    }
    public void setName(String x)
    {
        name = x;
    }
    public void setSalary(double y)
    {
        salary = y;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void displayEmployee(){
        System.
        out.println("Name: " + name + " - Salary: " + salary);
    }

}///end Employee
