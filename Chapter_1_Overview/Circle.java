package Chapter_1_Overview;

public class Circle {
    private double radius;

    // Pi is final so it will never change
    private static final double PI = 3.14;

    //constructor
    public  Circle (double radius){
    this.radius = radius;
    };// end or constructor

    public void set_radius(double radius){
    this.radius = radius;
    }//end of class method

    public double get_radius(){
        return radius;
    }// end of class method

    public double area(){
    return Math.PI * radius * radius;
    }//end of class method

}//end of class
