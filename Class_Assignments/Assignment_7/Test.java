package Class_Assignments.Assignment_7;

public class Test {
    public static void main(String[] args) {

        HashTable theHashTable = new HashTable(25);
        DataItem item1 = new DataItem(100);
        DataItem item2 = new DataItem(275);
        DataItem item3 = new DataItem(301);
        DataItem item4 = new DataItem(350);
        DataItem item5 = new DataItem(99);
        theHashTable.insert(item1);
        theHashTable.insert(item2);
        theHashTable.insert(item3);
        theHashTable.insert(item4);
        theHashTable.insert(item5);

        theHashTable.delete(301);
        theHashTable.displayTable();
        System.out.println( "The mimimum value is: " + theHashTable.findMin()) ;
    }///end main()

}///end class Test
