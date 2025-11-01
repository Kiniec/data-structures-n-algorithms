package Class_Assignments.Assignment_4;

public class Person {

    private String name;
    private double salary;

    public Person(String x, double y) {
        name = x;
        salary = y;
    }///end constructor

    public void setName(String x){
        name = x;
    }///end setName

    public void setSalary(double y){
        salary = y;
    }///setSalary

    public String getName(){
        return name;
    }///end getName

    public double getSalary(){
        return salary;
    }///end getSalary

    public void display(){
        System.out.println("Name: " + name + " - Salary: " + salary);
    }///end display()

}///end class Person
