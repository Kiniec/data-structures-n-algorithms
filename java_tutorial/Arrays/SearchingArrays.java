package java_tutorial.Arrays;
//can search an array((meaning to look for an element) by checking if the key is in one of teh array indexes
// will find it or reach the last index of the array without finding it
public class SearchingArrays {
    public static void main (String[] args) {
        int [] x = {1,2,3,4,5,6,7,8};
        int  key = 5; // to look for in loop
        int i; //global variable

        for (i = 0; i<x.length; i++) { // stop searching if found, i will be the index, here 1 = 4
            if (x[i] == key) {
                break;
            }//end of if in for loop
        }//end of for loop
        if (i == x.length) { //the loop ends without finding the key
            System.out.println("Not found");
        }//end of if statement
        else {
            System.out.println("found at index " + i);
        }//end of else statement
    }//end of main method
} //end of class
