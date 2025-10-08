package Chapter_2.binary_search;

public class OrderedArray {
    private int[]a;
    private int nElems;

    public OrderedArray(int size) {
        a = new int[size]; ///nElems= 0
    }///end of construtor

    public int size(){
        return nElems;
    }/// end of size

    public int find(int searchKey) {
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
                    upperBound = curIn - 1; ///it's in a lower half
                }///end of else

             }///end else
         }///end while
      }///end of find()

    public void insert ( int value ){
        if(nElems < a.length) {
            int j;
            for (j = 0; j < nElems; j++) {
                if (a[j] > value) {
                    break;
                }///end if
                }///end for
                for( int k =nElems; k > j; k--) { ///moves bigger ones up
                a[k] = a[k-1];
                }///end for
            a[j] = (int) value; /// insert it
            nElems++;
            }///end if
            else{
            System.out.println( "Cannot insert, array is full");
            }///end else
      }///end of insert

    public boolean delete( int value){
            int j = find(value);
            if (j == nElems){
                return false;///can't find it
            }///end if
            else{ ///found it
                for(int k = j ; k < nElems -1; k++){ ///move bigger ones down,
                ///use nElem-1 to make sure to not run over the length of the array
                a[k] = a[k+1];
                }///end for
            nElems--; /// delete the number of elements by one.
            return true;
            }///end else
        }///end delete
    public void display(){
        for(int j=0 ; j < nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }///end of display
} ///end class OrderArray
