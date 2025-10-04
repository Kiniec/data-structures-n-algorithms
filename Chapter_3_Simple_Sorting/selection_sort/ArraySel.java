package Chapter_3_Simple_Sorting.selection_sort;

public class ArraySel {
    private long [] a;      /// ref to array a
    private int nElems;     /// number of data times

    public ArraySel(int max) {///constructor
       a = new long [max];  ///create the array
        nElems = 0;            ///no item yet
    }///end ArraySel

    public void insert(long value ){ ///put element into array
        a[nElems ] = value;         ///insert it
        nElems++;                   ///insert size
    }///end insert()

    public void display() {             /// displays array contents
        for(int j = 0; j< nElems; j++){  ///for each element,
            System.out.print(a[j] + " "); ///display it
            System.out.print("");
        }///end for
    }///end display()

    public void selectionSort(){
        int out, in, min;
        for(out = 0 ; out < nElems-1; out++){          ///outer loop
            min = out;
            for(in = out + 1; in < nElems; in++){
                if(a[in] < a[min]){         ///if min is greater
                    min = in;               ///we have a new min
                }///end if
            }///end inner for
            long temp = a[out];
            a[out] = a[min];
            a[min ] = temp;
        }/// end outer for
    }///end selectionSort()

} ///end class ArraySel
