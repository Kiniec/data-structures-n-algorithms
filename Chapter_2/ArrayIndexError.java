package Chapter_2;

public class ArrayIndexError {
    public static void main (String[]args){
        int [] x = new int [5];
        x [3] = 9; //inserts contents into the array

        String [] y = new String[5];



        System.out.println(x.length); //prints out the length of the array x
        System.out.println(x); // prints the address for x where it is located in memory
        System.out.println(x[3]); // prints out the contents of array x
        System.out.println(x[0]); // will print out 0 as a default for an unspecified index
        System.out.println(y[2]); // prints out null if index of string is unspecified
    }//end of main method

}// end of ArrayIndexError class
