package Chapter_2.dividing_program_into_class;

public class HighArray {
    private long[] a; ///data field array
    private int nElems; ///data field number of elements

    public HighArray( int max ){
        a = new long[max];
    }///constructor
     public boolean find( long searchKey ){ ///???? where does the search key come from
        int j;
        for(j=0 ; j<nElems ; j++){ ///searching for
            if (a [j] == searchKey){
                break;
            }
        }///end of for
        if(j == nElems){
            return false;
        }///end if
        else{
            return true;
        }///end else
     }///end find()

     public void insert(long value){///adds elements to array
        a[nElems] = value;
        nElems++;
     }///end of insert()

    public boolean delete(long value) {/// delte a value
        int j;
        for(j = 0; j< nElems; j++){ ///look for value
            if( value == a[j]){///found
                break;
            }/// end if
             }///end of for
            if( j == nElems){
                return false; ///cant find
            }///end if
            else{
                int k;
                for( k = j; k<nElems; k++){
                    a[k] = a[ k + 1];
                }///end for
                nElems--;
                return true;
            }///end of els
     }///end of delete()

    public void display(){
         for( int j = 0; j< nElems; j++){
             System.out.println(a[j] + " ");
         }///end for
    }///end display()
}///end of class */
