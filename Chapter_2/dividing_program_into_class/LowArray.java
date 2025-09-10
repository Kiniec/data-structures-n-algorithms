package Chapter_2.dividing_program_into_class;

public class LowArray {

    private long[] a;// datafield/datatype  variables

    public LowArray(int size) {
        a = new long[size];
    }//end of constructor

    public void setElem(int index, long value) {
        a[index] = value; // set value at index
    }//end of class method setElm

    public long getElem(int index) {
        return a[index]; //return the element
    }//end of class method getElem

}//end of LowArray class
