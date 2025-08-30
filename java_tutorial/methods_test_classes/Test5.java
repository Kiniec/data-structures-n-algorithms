package java_tutorial.methods_test_classes;

public class Test5{
    public static void main(String[]args){
        int r = Test1.add(7,8); // calling the method by its class_name.Method_name because it is in differrent class
        // we sent 7 and 8 because the method is defied to receive two integer values
        // defined a variable r to store the returned valueS
        System.out.println(r);
    }// end of main method

    public class Test1{
        public static int add(int x, int y){ //the type is int because we are returning integer
            int z = x+y;
            return z;
        }


    }// end of test method

} //end of class
