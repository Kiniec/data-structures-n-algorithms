package Chapter_2.storing_objects;

public class ClassDataArray {
    private Person[] a;  ///reference to array
    private int nElems;  /// number of data items

    public ClassDataArray(int max ) {///contructor()
        a = new Person[max];           ///create Object array
        nElems = 0;                 /// no items yet
    }/// end ClassDataArray

    public Person find(String searchName){ /// find specified value
        int j;
        for(j =0; j< nElems; j++){ ///for each element
            if( a[j].getLast().equals(searchName)){ /// found item
                break;
            }///end if
            if( j == nElems){ ///reach end
                return null;
            }///end if
            else{
                return a[j];
            }///end else
        }///end for
        return null;
    }///end find()

    public void insert(String last, String first, int age ){ /// put person in array
        a[nElems] = new Person(last, first, age);
        nElems++; /// increment size
    }///end insert()

    public boolean delete (String searchName){
        int j;
        for( j=0; j<nElems; j++){/// look for it
            if (a[j].getLast().equals(searchName)){
                break;
            }///end if
            if( j == nElems){ ///can't find it
                return false;
            }///end if
            else{
                for( int k = j; k <nElems; k++){ ///shift down
                    a[k] = a[k+1];
                    nElems--; /// decrement size
                 }///end for
            }///end else
        }///end for

        return true;
    }///end delete()
    public void displayA(){///displays array contents
        for( int j = 0; j <nElems; j++){ ///for each element
            a[j].displayPerson(); /// display the element
        }///end for
    }///end displayA
}/// end ClassDataArray
