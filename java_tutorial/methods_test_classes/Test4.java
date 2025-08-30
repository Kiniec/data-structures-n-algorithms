package java_tutorial.methods_test_classes;

public class Test4 {
    public static void main(String[]args){
        int r = add(7,8);
        //calling the method by its name only because it is in the same class
        // sent 7 and 8 because the method is defied to receive two integer values
        //defined a variable r to store the returned value
        System.out.println(r);
    }// end of main method
        public static int add(int x, int y){ // the type is int because we are returning integer
            int z = x + y;
            return z;
        }// end of add method



} //end of class
