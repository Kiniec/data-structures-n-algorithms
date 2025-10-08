package Chapter_2.binary_search;

public class TestOrderedArrays {
    public static void main(String[] args) {
        int size = 100;
        OrderedArray arr = new OrderedArray(size);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 55; ///searching for item 55
        if( arr.find(searchKey) != arr.size()){
            System.out.println("Found" + searchKey);
        }///end if
        else {
            System.out.println("Can't find" + searchKey);
        }///end else
        arr.display(); /// display items
        arr.delete(0);///delte items
        arr.display();///display after deleting 3 items


    }///end main()
}///end class TestOrderedArrays
