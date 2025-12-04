package Chapter_2.storing_objects;

import java.util.Arrays;

public class DataArray {
    private Person[] a;  ///reference to array
    private int nElems;



    /// number of data items

    public DataArray(int size ) {///constructor()
        a = new Person[size];           ///create Object array
        ///nElems = 0;                 /// no items yet
    }/// end ClassDataArray

    public Person find(String searchName){ /// find specified value
        int j;
        for(j =0; j< nElems; j++){ ///for each element
            if( a[j].getLast().equals(searchName)){ /// found item
                break;
            }///end if
           }///end for
        if( j == nElems){ ///reach end
                return null;
            }///end if
            else{
                return a[j];
            }///end else
    }///end find()

    public void insert(String last, String first, int age ){ /// put person in array


            if ( nElems < a.length )
            {
                int j ;
                for ( j =0; j < nElems ; j ++)
                {
                    if ( a [ j ].getLast().compareTo(last)>0 )
                    {
                        break ;
                    }
                } // end for
                for ( int k = nElems ;k > j ;k --){ // move bigger ones up
                    a [ k ] = a [k -1];
                } // end for
                a [ j ] = new Person(last, first, age); // insert it
                nElems ++;
            } else
            {
                System . out . println ( " Cannot insert , array is full " );
            }
        } // end insert ()




    public boolean delete (String searchName){
        int j;
        for( j=0; j<nElems; j++){/// look for it
            if (a[j].getLast().equals(searchName)){
                break;
            }///end if
        }///end for
            if( j == nElems){ ///can't find it
                return false;
            }///end if
            else{
                for( int k = j; k <nElems; k++){ ///shift down
                    a[k] = a[k+1];

                 }///end for
            }///end else

        nElems--; /// decrement size
        return true;
    }///end delete()
    public void displayA(){///displays array contents
        for( int j = 0; j <nElems; j++){ ///for each element
            a[j].displayPerson(); /// display the element
        }///end for
    }///end displayA
}/// end ClassDataArray
