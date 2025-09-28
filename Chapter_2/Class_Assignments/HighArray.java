package Chapter_2.Class_Assignments;


import static java.lang.Math.max;

public class HighArray {
    private long [] a;
    private int nElems;

    public HighArray(int size ){
        a = new long [size];
    }///end HighArray

    public long findMax(){
        int out , in ;
        for(out = nElems -1; out >0; out--){
            for(in =0; in < out ; in ++){
                if ( a [ in ] > a [ in +1] ) {
                    long temp = a [ in ];
                    a [ in ] = a [ in +1];
                    a [ in +1] = temp ;
                    }///end if
                } /// end inner
        } /// end outer
        return a[nElems-1];
    }///end findMax();

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }///end insert()

    public void display(){
        for( int j = 0; j <nElems; j++){
            System.out.print(a[j] + " ");
        }///end for
        System.out.println();
    }///end display()

}///end  HighArray
