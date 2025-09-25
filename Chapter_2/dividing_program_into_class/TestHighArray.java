package Chapter_2.dividing_program_into_class;

public class TestHighArray {
<<<<<<< HEAD
    public static void main(String[]args){
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize); //create object of HighArray
        arr.insert(77); //insert 10 items first number being for index 0
=======
    public static void main(String[] args){
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);/// create the array
        arr.insert(77);
>>>>>>> 0436ef455a6983f45217604edab3fbb17700f373
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
<<<<<<< HEAD
        arr.display();
        int searchkey = 35;
        if( arr.find(searchkey)){
            System.out.println("Found " + searchkey);
        }//end if
        else{
            System.out.println("Can't find " + searchkey );
        }//end else
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();

    }// end of main()
}// end of class TestHighArray
=======
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


>>>>>>> 0436ef455a6983f45217604edab3fbb17700f373
