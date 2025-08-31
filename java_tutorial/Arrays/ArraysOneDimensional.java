package java_tutorial.Arrays;


//Data_type [] variable_name = new Data_type [size ]
public class ArraysOneDimensional {
    public static void main (String[]args) {
        int [] x = new int [5]; // an array of 5 integers
       x[4]=7;
    System.out.println(x[4]);
        double [] y;
        y = new double [5];// an array of 5 double values

        String[] z = {"Hello", "Apple"};
        System.out.println( z[1]+ " " + z[0]);
    } //end of the main method

//Can not just print the array address which is x. x is a reference data type

} // end of class
