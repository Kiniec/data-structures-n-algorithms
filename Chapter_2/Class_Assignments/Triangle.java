package Chapter_2.Class_Assignments;

public class Triangle {
    private double base; //data field type
    private double height; // data field type

    public Triangle(double x, double y ) { // Constructor
       base = x;
       height = y;
        //System.out.println( "Base: " + x);
        //System.out.println( "Height: " + y);
    }
    public void setTriangle( ){ //sets setter
        double b = this.base;
        double h = this.height;
    }//end of setter()


    public double getBase(){ //set getter
        return base;
        //return base;
    }//end of getBase();

    public double getHeight(){
        return height;

    }//end of getterHeight();

    public double area( ) { //sets the area of Triangle and returns the value.
        return 0.5 * base * height;
    }

} //end of Triangle class
