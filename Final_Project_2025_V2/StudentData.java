package Final_Project_2025_V2;




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentData {

    /*variables for class StudentData*/
    private Student [] s;
    private int nElems;
    private int maxSize = 20;
    private File file;

    public StudentData( ) { /// creates object of StudentData
        s = new Student[20]; /// init array of 20 Students
        nElems = 0;
    }/// end constructor StudentData

    /*gets file from text*/
    public void getFile() throws FileNotFoundException {
        File file = new File("/Users/markiniec/IdeaProjects/data-structures-n-algorithms/Students.txt");
        Scanner st_input = new Scanner(file); ///scanner and receive input
        int i = 0;

        while (st_input.hasNextLine()) { /// while loop to receive inputs to place in array
            String st_l = st_input.nextLine(); /// init input to string
            String[] stData  = st_l.split(","); ///init to String array separates data by delimiter ","

                String name = stData[0].trim();           /// parses index 0 to string
                int q = Integer.parseInt(stData[1].trim()); ///parses index 1 to int
                int a = Integer.parseInt(stData[2].trim()); ///parses index 2 to int
                int e = Integer.parseInt(stData[3].trim()); ///parses index 3 to int
                int  p = Integer.parseInt(stData[4].trim()); /// parses index 4 to int

            s[i] = new Student(name, q, a, e, p); /// creates a new array with data to send to Student
            i++; ///increment the array s by one

            /*sort then insert*/
            if ( nElems < s.length ) { /// sort name by first letter
                int j ;
                for ( j =0; j < nElems ; j ++) { /// to go through elements
                    if ( s[ j ].getName().compareTo( name)>0 ) { /// compares the first letter of the name
                        break ;
                    }
                } // end for
                for ( int k = nElems ;k > j ;k --){ /// move bigger ones up
                    s [ k ] = s [k -1];
                } // end for
                s [ j ] = new Student(name, q, a,e,p); /// insert into array
                nElems ++;
            } else
            {
                System . out . println ( " Cannot insert , array is full " );
            }
        }///end while

    }///end getFile

    public void getCount() {
        int[] counts = new int[5];
        for (int i = 0; i < nElems; i++) {
            char g = s[i].getGrade();

            if (g == 'A') {
                counts[0]++;
            } else if (g == 'B') {
                counts[1]++;
            } else if (g == 'C') {
                counts[2]++;
            } else if (g == 'D') {
                counts[3]++;
            } else if (g == 'F') {
                counts[4]++;
            }



        }
            System.out.println("Number of A's: " + counts[0] + ", Number of B's: " +
                    counts[1] + ", Number of C's: " + counts[2] + ", Number of D's: "
                    + counts[3] + ", Number of F's: " + counts[4]);

       // return counts;
    }///end getCount


    public void display(){     ///displays array contents

        for(int j=0; j<nElems; j++){ ///for each element
            s[j].displayStudent();  ///for each element
            s[j].finalGrade();

            System.out.println(" "); ///display it
        }///end for
    }///end display()


}///end class StudentData
