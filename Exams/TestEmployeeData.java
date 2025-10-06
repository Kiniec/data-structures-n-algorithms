package Exams;



public class TestEmployeeData {
    public static void main (String[] args) {

        int maxSize = 10;
        EmployeeData arr = new EmployeeData(maxSize);

        arr.insert( "John Smith", "Microsoft", 1);
        arr.insert( "William Thomas", "Apple", 2);
        arr.insert("Alex Garcia", "Samsung", 3);
        arr.insert("Mary Wilhithe", "Google", 4);

        arr.display();
        arr.sort();
        arr.display();









    }///end the main method


} ///end class TestEmployeeData
