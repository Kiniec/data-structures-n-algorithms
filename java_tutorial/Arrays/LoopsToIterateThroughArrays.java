package java_tutorial.Arrays;
//loops are usually used to iterate through arrays
    //visiting all the elements to insert, search, display, etc.
public class LoopsToIterateThroughArrays {
        public static void main (String[]args){
            int [] x = {1,2,3,4,5}; // an array of 5 integers

            for (int i=0; i<5; i++){ //0 is the index in the array
                System.out.print(x[i] + " "); //can print the x inside the for loop because it is a global variable
            }//end of for loop
            System.out.println(); //prints a space
            System.out.print(x.length); //prints the length of the array
        }//end of main method
} //end of class