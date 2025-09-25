package Chapter_2.dividing_program_into_class;

public class HighArray {
    private long[] a; //data field array
    private int nElems; //data field number of elements

    public HighArray( int max ){
        a = new long[max];
    }//constructor
     public boolean find( long searchKey ){ //looks through the array for the item whose value was passed to is as an argument / returns true or false
        int j;
        for(j=0 ; j<nElems ; j++){ //searching for
            if (a [j] ==searchKey){
                break;
            }
        }//end of for
      if(j == nElems){
          return false;
      }
      else {
          return true;
      }
    }//end find()

    public void insert(long value){ //places a new data item in the next available space in the array/ nElems keeps track of the numbers of array cells that are actually filled with data items.
        a[nElems]= value;
        nElems++;
    } // end of insert()

    public boolean delete (long value) { //delete a value
        int j;
        for( j= 0; j < nElems; j++) { //look for value
            if ( value == a[j]){ //found
                break;
            }//end if
        }//end of for
        if( j == nElems){
            return false; //can't find
        }//end if
        else{
            int k;
            for( k = j; k<nElems; k++) {
                a[k] = a[k + 1];
            }//end of for
            return true;
        }//end else
    }// end of boolean()
    public void display(){ // display elements
    for(int j =0; j <nElems; j++){
        System.out.print(a[j] + " ");
    }//end of for
        System.out.println();
    }//end of display()
}//end of class HighArray
