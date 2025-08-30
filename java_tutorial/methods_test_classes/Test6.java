package java_tutorial.methods_test_classes;

public class Test6 {
    public static void main (String[]args) {
        add(7,8); //java will match the paramter. Therefore, it will call the second method.

    } //end of main method
    public static void add(){
        int z = 5+6;
        System.out.println(z);
    }//end of the add method with no parameters
    public static void add(int x, int y) {
        System.out.println(x + y);
    }//end of the add method with 2 parameters to be called
}// end of class
