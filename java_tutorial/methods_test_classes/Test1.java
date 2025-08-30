package java_tutorial.methods_test_classes;

public class Test1 {
    public static void main (String[]args) {
        add(); //calling the method by its name only because it is in the same class
        //we left the parentheses empty because the method is not defined to receive values
    }
    public static void add(){ //void method that can receive two values
        int x = 5;
        int y= 6;
        int z= x+y;
        System.out.println(z);

    }//end of add method


} //end of class
