package Exams;

public class Employee {
    private String name;
    private String companyName;
    private int rank;

    public Employee(String n, String cn, int r ){
        name = n;
        companyName = cn;
        rank = r;
    }///end Employee

    public String getName(){
        return name;
    }///end getName()

    public String getCompanyName(){
        return companyName;
    }///end getCompanyName()

    public int getRank(){
        return rank;
    }///end getRank

    public void displayE(){
        System.out.print("Name:" + name);
        System.out.print("Company Name:" + companyName);
        System.out.print("Rank:" + rank);
        System.out.println();
    }///end display

}/// end class Employee
