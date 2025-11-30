package Chapter_3_Simple_Sorting.object_sort;

public class ArrayInOb {
    private Person [] a;    ///ref ti array a
    private int nElems;         ///number of data items

    public ArrayInOb(int max){

        a = new Person[max];        ///create the array
    }/// end ArrayInOb constructor

    public void insert(String last, String first, int age, String rank, int id, String city, char gender ){
        a[nElems] = new Person(last, first, age, rank, id, city, gender);
        nElems++; /// increment size
    }///end insert()

    public void display(){     ///displays array contents
        for(int j=0; j<nElems; j++){ ///for each element
            a[j].displayPerson();  ///for each element
            System.out.println(" "); ///display it
        }///end for
    }///end display()

    public void insertionSort(){
        int in;
        int out;
        for(out = 1; out < nElems ; out++){  /// out is dividing line
            Person temp = a[out];                 /// remove marked item
            in = out;                           ///start shifts at out
            while(in > 0 && a[in-1].getGender() > temp.getGender())  {    ///until one is smaller
                a[in] = a[in - 1];               ///shift item to the right
                --in;                            /// in-- go left one position
            }///end while
            a[in] = temp;                       ///insert marker item
            }///end for
    }///end insertionSort()
}///end of ArrayInOb

/// a[in-1].getCity().compareTo(temp.getCity())
///in > 0 && a[in-1].getAge() > temp.getAge()