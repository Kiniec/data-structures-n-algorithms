package Chapter_2.procedural_version;

public class Test {
    public static void main(String[]args){
        long [] arr; // create reference variable
        arr = new long [100]; //create the array
        /* same as
         long [] arr = new long [1000]
         */
      int nElems = 0; //number of elements
      int  j; //loop counter
      long searchKey; //key of item to search for
      arr[0] = 77; // assigning index 0 to the int 77
      arr [1] = 99;
      arr [2] = 44;
      arr [3] = 55;
      arr [4] = 22;
      arr [5] = 88;
      arr [6] = 11;
      arr [7] = 00;
      arr [8] = 66;
      arr [9] = 33;
      nElems = 10;

      for (j=0 ; j<nElems; j++){
          System.out.print(arr[j] + " ");

      }//end of for loop
        System.out.println(); // print empty line
        searchKey = 66; //find item with key 66
        for (j=0; j<nElems; j++) {
            if (arr[j] == searchKey){
                break;
        }
        }//end of for loop
        if (j == nElems){
            System.out.println("Can't find" + searchKey);
        }//end of if statement
        else {
            System.out.println("Found " + searchKey);
        }//end of else statement
        searchKey = 55; //delete item with key 55
        for (j=0; j<nElems; j++){
            if ( arr[j] ==searchKey) {
                break;
            }//end of if
        }//end of for
        for (int k=j; k<nElems -1; k++){ //move higher ones down
            arr[k] = arr[k+1];
        }//end of for
        nElems--; //decrement size to print 9 elements
        for (j=0; j<nElems; j++){
            System.out.print(arr[j] + " ");
        }//end of for

    }//end of main method





}//end of class Test
