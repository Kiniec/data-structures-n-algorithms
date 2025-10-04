package Chapter_3_Simple_Sorting.selection_sort;

public class SelectSortApp {
    public static void main(String[] args){
        int maxSize = 100;      ///array size
        ArraySel arr = new ArraySel(maxSize);     ///reference to array

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

        arr.display();              /// display items
        arr.selectionSort();        ///selection-sort items
        System.out.println(" ");
        arr.display();              ///display them again
    }///end main()
}///end class SelectSortApp
