package Chapter_2.Class_Assignments;

public class TestTriangle {
    public static void main(String[]args){
        Triangle t = new Triangle( 7.5,12.3 ); //creates Triangle object

        System.out.println("Base: " + t.getBase());
        System.out.println("Height: " + t.getHeight());
        System.out.println("Area: " + t.area());
    }//end of main method

}//end of class
