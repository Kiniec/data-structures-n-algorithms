package Chapter_2.Class_Assignments;

public class Triangle {
    private double base; //data field type
    private double height; // data field type

    public Triangle(double x, double y ) { // Constructor
        base = x;
        height = y;
    }
   public void setHeight(double x)
   {
       height=x;
   }
   public void setBase(double y)
   {
       base=y;
   }


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
