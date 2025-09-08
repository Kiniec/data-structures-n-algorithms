package Chapter_2;

import java.util.Random;

public class RandomArrayRange {
    public static void main(String[]args){
        int [] myArray = new int [5]; // create object of array
        Random random = new Random();
        int min = 10;
        int max = 50;

        // fill the array with random numbers between 10 and 50
        for (int i =0; i < myArray.length; i ++){
            myArray[i] = random.nextInt( max- min + 1) + min;
        }//end of for

        //print array
            System.out.println("Array elements (range: 10-50: )");
            for( int i = 0; i < myArray.length; i ++){
                System.out.println("Element " + i + ":" + myArray[i]);
            }//end of for
    }//end of main method
} //end of class

