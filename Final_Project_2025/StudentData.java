package Final_Project_2025;



public class StudentData {
    private Student first;

    public StudentData(){
        first = null;
     }///end constructor StudentData

    public void insert( String stu) {
        Student newLink = new Student( stu );
        newLink.setNext(first);
        first = newLink;
    }///end insert()

    public void displayList() { ///used to display an element

        Student current = first;
        while (current != null) {
            current.getName();
            current = current.getNext();
        }///end while loop
    }





}///end Class StudentData
