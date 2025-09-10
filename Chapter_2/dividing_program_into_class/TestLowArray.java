package Chapter_2.dividing_program_into_class;

public class TestLowArray {
    public static void main(String[]args){
      LowArray arr; //reference variable from class LowArray
        arr = new LowArray(100);// create LowArray Object
        int nElems = 0;
        int j;
        arr.setElem(0,77); //insert 10 items
        arr.setElem(1,99);
        arr.setElem(2,44);
        arr.setElem(3,55);
        arr.setElem(4,22);
        arr.setElem(5,88);
        arr.setElem(6,11);
        arr.setElem(7,00);
        arr.setElem(8,66);
        arr.setElem(9,33);
        nElems = 10; //now 10 items

        for(j = 0; j < nElems; j++) {// display 10 times
            System.out.print(arr.getElem(j) + " ");
        }//end for loop
        System.out.println();

        int searchKey = 26; // search for data item 26
        for (j = 0; j<nElems; j++) {
            if(arr.getElem( j ) == searchKey){  // found the item
                break;
            }// end of four
         if(j == nElems){ //not found
             System.out.println("Can't find " + searchKey);
        }
         else{
             System.out.println(  " Found " + searchKey);
         }
       //delete value 55
            for (j =0; j < nElems; j++){ //look for it
                if (arr.getElem(j) == 55) //found it
                    break;
            }//end of for
            for (int k=j; k < nElems; k++){
                arr.setElem(k, arr.getElem(k +1 )); //higher ones down
            }//end of for

            nElems--;//decrease the size to print 9 elements
             for(j=0; j< nElems; j++){ // display the 9 times
                System.out.print(arr.getElem(j) + " ");
             }
        }//end of for
             System.out.println();


    }//end of main method

}//end of class
