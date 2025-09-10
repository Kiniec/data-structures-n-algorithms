package java_tutorial;
import java.util.Scanner;


public class ScannerClass {
   public static void main(String[]args){
       Scanner input = new Scanner(System.in); //here Scanner is the class and the constructor is Scanner(System.in)
       System.out.print("Enter a number: ");
       int x = input.nextInt(); // object.method()

       System.out.print("You are " + x + " years of age");
       System.out.println();
       Scanner firstname = new Scanner(System.in);
       System.out.print(" What  is the first name? ");
       String f = firstname.next();
       Scanner lastname = new Scanner(System.in);
       System.out.print(" What is your last name?");
       String l = lastname.nextLine();

       String finitial = f;
       String linitial = l;

       System.out.print(" Your first name and last name initials are " + finitial.charAt(0)+linitial.charAt(0) );
       System.out.println();
       String xp= "Hello World";
       String r1 = xp.substring(4);
       System.out.print(r1);
       System.out.println();
       System.out.print( xp.charAt(5));
       int r3 = xp.indexOf('1'); // return the index of the first occurrence of 'l'
       System.out.println(r3);
//end of for

   }//end of main method

}//end of class
