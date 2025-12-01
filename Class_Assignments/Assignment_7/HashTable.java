package Class_Assignments.Assignment_7;

public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }///end HashTable

    public int hashFunc(int number) {
        int index = number % arraySize;
        return index;
    }///end hasFunc

    public void displayTable() {
        for(int i =0; i<arraySize;i++) {
            if(hashArray[i] !=null) {
                System.out.print(hashArray[i].getNumber() + " ");
            }///end if
            else {
                System.out.print("** ");
            }///end else
        }///end for
        System.out.println();
    }///end displayTable()

    public void insert(DataItem item) {
        int number = item.getNumber();
        int hashValue = hashFunc(number);

        while(hashArray[hashValue] !=null && hashArray[hashValue].getNumber() != -1) {
            ++hashValue;
            hashValue %= arraySize;
        }///end while
        hashArray[hashValue] = item;
    }///end insert()

    public DataItem delete(int number) {
        int hashValue = hashFunc(number);
        while(hashArray[hashValue] !=null) {
            if(hashArray[hashValue].getNumber()==number) {
                DataItem temp = hashArray[hashValue];
                hashArray[hashValue] = nonItem;
                return temp;
            }///end if
            ++hashValue;
            hashValue %=arraySize;
        }///end while
        return null;
    }///end delete()

    public DataItem find(int number) {
        int hashValue = hashFunc(number);
        while(hashArray[hashValue] !=null) {
            if(hashArray[hashValue].getNumber()==number) {
                return hashArray[hashValue];
            }///end if
            ++hashValue;
            hashValue %= arraySize;
        }///end while
        return null;
    }///end find()

    public int findMin() {
        int Min = Integer.MAX_VALUE; /// the max value of the
       for(int i =0; i<arraySize;i++) { ///  loop through to find min val of array
           if(hashArray [i] != null && hashArray[i].getNumber() != -1 ){ /// if the index
               int currentNumber =  hashArray[i].getNumber();
               if(currentNumber != -1 && currentNumber < Min) { /// compares the current number with Min
                   Min =currentNumber; ///if less than Min, will become the currentNumber
               }///end if

           }///end if
       }///end  for
       return  Min;

    }///end findMin

}///end class HashTable
