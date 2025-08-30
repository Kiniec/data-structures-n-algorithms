package java_tutorial.Arrays;



//when you send an array to a method, you should send the variable name without "[]"
//Example
    //display(x)
        // display is the method
        // the array x is being sent to the method
//if method returns array, its return type and []
public class ArraysWithStaticMethods {
    public static void main(String[]args){
         int [] x = new int [10]; //set array named x with 10 indexes


         //filling the array with random numbers 5 - 30 excluding 30
        for (int i = 0; i<x.length; i++){
            x[i]= (int)(5 + Math.random()* 25 );
        }//end of for loop
        int [] y = new int [5]; // creates array y with 5 indexes
        for (int i =0; i<y.length; i++){
            y[i] = (int) (5  + Math.random() * 25);
        }//end of for loop

        display(y);
        System.out.println( search(y,10));
        display(x);
        String r =  search(x,20);
        System.out.println(r);
    }//end if main method

        public static String search(int[]x, int key){
        int i;
        for (i = 0; i < x.length; i++){
            if(x[i] == key){ //stop searching if found, i will be the index, here i = 4
                break;
            }//end of if statement
        }//end of for loop
            if (i==x.length){ //the loop ends without finding the key
                return "not found";
            }//end of if statement
            else {
                return "found";
            }//end of else statement



        }//end of method named search

        public static void display(int[]x){
         for (int i = 0; i < x.length; i++){
             System.out.print(x[i ] + " ");
         }//end of for loop
        }//end of method display

} // end of class ArraysWithStaticMethods

