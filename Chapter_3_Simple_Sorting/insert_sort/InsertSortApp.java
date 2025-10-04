package Chapter_3_Simple_Sorting.insert_sort;

public class InsertSortApp {
    public static void main(String[] args ){
        int maxSize = 100;          /// array size
        ArrayIns arr = new ArrayIns(maxSize); ///reference toa and create array

        arr.insert (77);
        arr.insert (99);
        arr.insert (44);
        arr.insert (55);
        arr.insert (22);
        arr.insert (88);
        arr.insert (11);
        arr.insert (00);
        arr.insert (66);
        arr.insert (33);

        arr.display();
        arr.insertionSort();
        arr.display();
    }///end main()

}///end InsertSortApp
