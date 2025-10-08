package Exams;

import Chapter_3_Simple_Sorting.object_sort.Person;

public class CarData {
    private Car[] a;
    private int nElems;

    public CarData(int max){
        a = new Car [max];        ///create the array
    }/// end ArrayInOb constructor

    public int size(){
        return nElems;
    }///end size()

    public void insert(Car c ){
            a[nElems] =c;
            nElems++; /// increment size
        }///end insert()

    public void display(){
        for(int j=0; j<nElems; j++){
            a[j].displayC();
            System.out.println(" ");
        }///end for
    }///end display()

    public void insertionSort(){
        int in;
        int out;
        for(out = 1; out < nElems ; out++){
            Car temp = a[out];
            in = out;
            while(in > 0 && a[in-1].getMake().compareTo( temp.getMake()) > 0 )  {
                a[in] = a[in - 1];
                --in;
            }///end while
            a[in] = temp;
        }///end for
    }///end insertionSort()

    public Car search(String searchKey) {
        int i;
  for(i=0;i<nElems;i++)
  {
      if(a[i].getMake().equals(searchKey))
      {
        break;
      }
  }
  if(i==nElems)
  {
      return null;
  }
  else {
      return a[i];
  }

    }///end of find()

}/// end CarData
