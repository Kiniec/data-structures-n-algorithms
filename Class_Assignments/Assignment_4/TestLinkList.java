package Class_Assignments.Assignment_4;

public class TestLinkList {
    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.insertFirst("Mary", 7000.0);
        list.insertFirst("Saif", 8000.0);
        list.insertFirst("Alex", 7500.0);
        list.insertFirst("Alica", 6500.0);

        list.display();
        if( list.find("Alica")!=null){
            System.out.println("Found");
       }///end if
        else{
           System.out.println("Not Found");
        }///end else
    }///end main()
}///end TestLinkList
