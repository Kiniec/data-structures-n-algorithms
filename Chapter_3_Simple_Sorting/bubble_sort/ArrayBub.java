package Chapter_3_Simple_Sorting.bubble_sort;

public class ArrayBub {
    private long [] a; /// ref to array a
    private int nElems; ///number of data items

    public ArrayBub (int max ){          ///constructor
        a = new long[max];      ///create the array
        nElems = 0;                     ///no items yet
    }///end ArrayBub

    public void insert(long value) {
        a[nElems] = value;              /// insert it
        nElems++;                       ///increment size
    }///end insert()

    public void display(){              ///display array contents
        for( int j = 0 ; j < nElems; j++){ ///for each element
            System.out.print(a[j] + " ");  ///display it

        }///end for

    }///end display

    public void bubblesort(){
        int out, in;
        for(out = nElems - 1; out > 0; out --){ ///outer loop (backward)
            for( in = 0; in < out; in++){       ///inner loop (forward)
                if( a[in] > a[in +1]  ){
                    long temp = a [ in ];
                    a [ in ] = a [ in +1];
                    a [ in +1] = temp ;
                }///end if
            }///end inner for
        }///end outer for
    }///end bubblesort()

    /*private void swap (int one, int two){
        long temp = a [one ];
        a[one] = a[two ];
        a[two] = temp;
        }
    }///end swap */

    }///end class ArrayBub
