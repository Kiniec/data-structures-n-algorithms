package Chapter_3_Simple_Sorting.object_sort;
import java.util.Arrays;
import java.util.Collections;

public class ObjectSortApp {
    public static void main(String[]args){
        int maxSize = 100;                  ///array size
        ArrayInOb arr = new ArrayInOb(maxSize); ///  reference and create array
        arr . insert ( " Evans"," Patty ",24, "1st", 980099, "Houston", 'F');
        arr . insert ( " Smith " , " Doc " , 59,  "10th",900908, "Dallas", 'M');
        arr . insert ( " Smith " , " Lorraine " , 37, "2nd", 978097, "Austin", 'F');
        arr . insert ( " Smith " , " Paul " , 37, "8th", 192009, "San Antonio", 'M');
        arr . insert ( " Yee " , " Tom " , 43, "6th" , 780923, "Templeton", 'M');
        arr . insert ( " Hashimoto " , " Sato ", 21, "7th", 209229, "Carlson City", 'M');
        arr . insert ( " Stimson " , " Henry " ,29, "3rd", 45678, "Jackson", 'M');
        arr . insert ( " Velasquez " , " Jose " , 72, "5th", 234343, "Pilot", 'M');
        arr . insert ( " Vang " , " Minh " , 22, "4th ", 906784, "Racon City", 'F');
        arr . insert ( " Creswell " , " Lucinda " , 18, "9th", 98090, "Florence", 'F');
        System.out.println("Before sorting:" );
        arr.display();                                      ///display items

        arr.insertionSort();                                   ///insertion-sort them

        System.out.println("After sorting :" );
        arr.display();                                      ///display them again


    }///end of main()



}/// end class ObjectSortApp
