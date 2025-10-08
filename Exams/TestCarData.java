package Exams;

public class TestCarData {
    public static void main(String[] args) {
        int maxSize = 10;

        CarData arr = new CarData(maxSize);
        Car c1 = new Car("BMW","X6", 2025 );
        arr.insert(c1);
        Car c2 = new Car("Mercedes","S", 2024 );
        arr.insert(c2);
        Car c3 = new Car("Audi","A7", 2023 );
        arr.insert(c3);
        Car c4 = new Car("Honda","Civic", 2020 );
        arr.insert(c4);


       System.out.println("Before sorting: ");
        arr.display();
        System.out.println("After sorting: ");
        arr.insertionSort();
        arr.display();

        String searchKey = "BMW"; /// searching for item 55
        if(arr.search(searchKey) != null){
            System.out.println( "Found " + searchKey );
        }///end  if
        else{
            System.out.println("Can't Find " + searchKey);
        }///end else



    }///end main()

}///end TestCarData
