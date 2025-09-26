package Chapter_2.storing_objects;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a){ ///constructor
        lastName = last;
        firstName = first;
        age = a;
    }//end Person
    public void displayPerson(){ /// displays Person's object data
        System.out.println(" Last name: " + lastName );
        System.out.println(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }///end display
    public String getLast(){   ///get last name - key field used for searches
        return lastName;
    }///end getLast
}/// end Person


