package java_tutorial.methods_test_classes;

public class Test3 {
    public static void main (String[]args){
        int r =  add(); //calling the method by its name only because it is in the same class
        //left the parentheses empty because the method is not defied to receive values
    System.out.println(r);
    }//end of main method

    public static int add(){ // the type is int because we are returning integer
     int x = 5;
     int y = 6;
     int z = x+y;
     return z;

    }//end of add() method

} //end of class
