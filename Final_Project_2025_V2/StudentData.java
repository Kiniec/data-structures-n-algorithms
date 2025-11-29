package Final_Project_2025_V2;

public class StudentData {
    private Student [] s;
    private int nElems;

    public StudentData(int maxSize) {
        s  = new Student [maxSize];
        nElems = 0;
    }///end constructor StudentData

    public void insert(String name, int quiz, int assignment, int exam, int project  ) {
        s[nElems] = new Student(name, quiz, assignment, exam, project  );
        nElems++;
    }











}///end class StudentData
