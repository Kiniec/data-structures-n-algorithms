package Chapter_2.binary_search;

public class OrderedArray {
    private long[]a;
    private int nElems;
    public OrderedArray(int max) {
        a = new long[max]; ///nElems= 0
    }///end of construtor
    public int size(){
        return nElems;
    }/// end of size
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;


        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn; ///found
            }///end of if
            else if (lowerBound > upperBound) {
                return nElems; ///can't find it
            }///end of else if
            else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1; /// it is in upper half
                }///end of if
                else {
                    upperBound = curIn - 1; ///its in a lower half
                }///end of else

             }///end else
         }///end while
      }///end of find()

public void insert ( long value ){
          int j;
          for (j = 0; j < nElems; j++){
              if ( a[j] < nElems > value){
                  break;
              }///end if
          }///end for
}///end of insert
} ///end class OrderArray
