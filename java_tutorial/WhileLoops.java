package java_tutorial;
import java.util.Scanner;

// WhileLoops are always used to create user-controlled loop.

public class WhileLoops {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        // the loop will repeat 10 times
        for(int i =0; i < 10; i++){
            System.out.println(i);
        }//end of for loop

        //the loop will repeat 10 times
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
         //the loop will repeat 10 times
        int j=0;
        do {
            System.out.println(j);
            j++;
        } while (i<10);

        //the loop will repeat until the user enters 99
        int x;
        while (true){
            x = input.nextInt();
            if (x==99) {
                break;
            }
            System.out.println(j);


        }

    }// end of main method

} //end of WhileLoops  class

