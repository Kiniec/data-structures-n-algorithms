package java_tutorial;

public class Strings {
    public static void main (String[] args) {
        //example to show strings methods
      String x = "Hello World";

      String r = x.substring(0,4);//return substring from index 0 to 4 (excluding 4)
      System.out.println(r);

      String r1 = x.substring(4); //return substring from index 0 to the last index
        System.out.println(r1);

        int r2 = x.length(); //return the length (number of chars)
        System.out.println(r2);

        int r3 = x.indexOf('1'); // return the index of the first occurrence of '1'
        System.out.println(r3);

        int r4 = x.lastIndexOf('1'); // return the index of '1' starting from index 4
        System.out.println(r4);

        int r5 = x.indexOf('1',4); // return the index of '1' starting from index 4
            System.out.println(r5);

             char r6  = x.charAt(4); //return the char at index 4
            System.out.println(r6);

            String r7 = x.toLowerCase(); //convert the string to lower case
            System.out.println(r7);

            String r8 = x.toUpperCase(); // convert the string to upper case
            System.out.println(r8);
        boolean r9 = Character.isDigit(x.charAt(6));// check if the character is digit
           System.out.println(r9);
        boolean r10 = Character.isLetter(x.charAt(6)); // check if the character is letter
            System.out.println(r10);




    } //end of main method
} //end of class
