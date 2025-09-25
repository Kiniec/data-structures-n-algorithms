package Chapter_2;

public class TestPrintArray{
    public static void main (String[]args){

        int [] x = new int [9]; //create array
        PrintArray arr = new PrintArray(x.length); //create object of PrintArray class
        arr.display();

    }//end of main
}//end of class


