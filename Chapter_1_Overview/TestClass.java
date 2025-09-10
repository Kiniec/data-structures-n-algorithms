package Chapter_1_Overview;

public class TestClass {
    public static void main(String[]args){
       Circle circle1 = new Circle(1.5); // create object circle1
       Circle circle2 = new Circle(2.5); // create object circle2
        circle1.set_radius(7.5);//set the radius of circle1
        circle2.set_radius(8.5);//set the radius for circle2
        System.out.println(circle1.area()); //print area of circle1
        System.out.println(circle2.area());// print the area of circle2
    }//end of main method

}//end of class
