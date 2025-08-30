package java_tutorial.methods_test_classes;

public class Test2 {
    public static void main(String[]args){
        add(7,8); //calling the method by its name only because it is the same class
            // we sent it two value because it is defined to receive two
    }//end of main method

    public  static void add(int x, int y) {// void method that can receive two values

        int z = x + y;
        System.out.println(z);

    }
}// end of class
