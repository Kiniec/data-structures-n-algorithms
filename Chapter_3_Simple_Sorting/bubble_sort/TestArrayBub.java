package Chapter_3_Simple_Sorting.bubble_sort;

public class TestArrayBub {
    public static void main(String[] args) {

        int maxSize = 100;  ///array size
        ArrayBub arr = new ArrayBub(maxSize); ///create reference to array and reference

        arr . insert (77);
        arr . insert (99);
        arr . insert (44);
        arr . insert (55);
        arr . insert (22);
        arr . insert (88);
        arr . insert (11);
        arr . insert (00);
        arr . insert (66);
        arr . insert (33);

        arr.display(); /// display items

        arr.bubblesort();   ///bubble sort
    System.out.println(" ");
        arr.display();      ///display again
    }///end main

}/// end class TestArrayBub
