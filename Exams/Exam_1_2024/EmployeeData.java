package Exams.Exam_1_2024;

public class EmployeeData {
    private Employee[] a;
    private int nElems;

    public EmployeeData(int maxSize) {
        a = new Employee[maxSize];

    }/// end Employee
    ///

    public int size(){
        return a.length;
    }///end size()

    public  void insert(String name, String companyName, int rank){
        a[nElems] = new Employee(name, companyName, rank);              /// insert it
        nElems++;
    }///end insert

    public void display(){
        for(int j = 0; j < nElems; j++){
            a[j].displayE();
        }///end for
        System.out.println();
    }///end display method

    public void sort(){
        int out;
        int in;
        for(out = nElems - 1; out > 0; out --){ ///outer loop (backward)
            for( in = 0; in < out; in++){       ///inner loop (forward)
                if( a[in].getRank() < a[in +1].getRank()  ){
                   Employee  temp = a [ in ];
                    a [ in ] = a [ in +1];
                    a [ in +1]=  temp ;
                }///end if
            }///end inner for
        }///end outer for
    }///end sort()


}///end class EmployeeData
