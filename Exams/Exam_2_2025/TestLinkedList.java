package Exams.Exam_2_2025;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFirst("Mary", 7000.0);
        list.insertFirst("Saif", 8000.0);
        list.insertFirst("Alex", 7500.0);
        list.insertFirst("Alica", 6500.0);
        list.increaseSalary(1000);
        list.display();
    }

}
