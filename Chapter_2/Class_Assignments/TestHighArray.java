package Chapter_2.Class_Assignments;

public class TestHighArray {
    public static void main (String[]args) {
        HighArray arr = new HighArray(100); ///creating object

        arr.insert(10);;
        arr.insert(20);
        arr.insert(30);
        arr.insert(90);
        arr.insert(80);
        arr.insert(70);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        arr.insert(33);

        arr.display();
        System.out.print("The largest number is: " + arr.findMax());
    }///end main()



}///end class TestHighArray
