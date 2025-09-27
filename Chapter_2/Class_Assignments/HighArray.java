package Chapter_2.Class_Assignments;

public class HighArray {
    private long [] a;
    private int nElems;

    public HighArray(int size ){
        a = new long[size];
    }///end HighArray

    public void  findMax( long a ){


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
