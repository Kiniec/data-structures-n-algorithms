package Chapter_2.dividing_program_into_class;

public class TestHighArray {
    public static void main(String[] args){
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);/// create the array
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
       arr.display();
       int searchKey = 35;
       if (arr.find(searchKey)){
           System.out.println("Found" + searchKey);
       }///end if
       else{
           System.out.println("Can't find" + searchKey);
       }///end else
        arr.delete(00);
        arr.delete(55);
        arr.delete(99 );
        arr.display();





    }///end of main method

}/// end of class TestHighArray


