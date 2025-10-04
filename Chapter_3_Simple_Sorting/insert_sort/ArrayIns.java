package Chapter_3_Simple_Sorting.insert_sort;

public class ArrayIns {
    private long [] a;  //ref to array a
    private int nElems; /// number of data items
    public ArrayIns(int max){
        a = new long[max]; /// create the array
        nElems = 0;
    }/// end of ArrayIns

    public void insert(long value ){ ///put element into array
        a[nElems] = value;             /// insert it
        nElems++;                   ///increment size
    }///end insert()

    public void display(){
        for( int j = 0; j < nElems; j++){      ///for each element
            System.out.print(a[j]   + " ");  ///display it
        }///end for
        System.out.println(" ");
    }///end display()

    public void insertionSort(){
        int in;
        int out;
        for(out =1 ; out < nElems ; out++){  /// out is dividing line
            long temp = a[out];                 /// remove marked item
            in = out;                           ///start shifts at out
            while(in>0 && a[in-1] >= temp ){    ///until one is smaller
                a[in] = a[in-1];                ///shift item to right
                --in;                           ///go left one position
            }///end while
            a[in] = temp;                       ///insert marker item
        }///end for
    }///end insertionSort()
}/// end class ArrayIns
