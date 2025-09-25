package Chapter_2;

public class PrintArray {
    private int [] x;
    public PrintArray( int arr ) {
        x = new int[arr];
    }//end of constructor
    public void display(){
        int i;
        for (i =0; i<x.length; i++){
            System.out.print(x[i] +" ");
        }

    }//end of display()
}// end of class
