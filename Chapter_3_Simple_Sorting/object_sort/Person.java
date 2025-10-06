package Chapter_3_Simple_Sorting.object_sort;

public class Person {
    private String lastname;
    private String firstname;
    private int age;
    private String rank;
    private int id;
    private String city;
    private Character gender;
    public Person(String last, String first, int a, String r, int i, String c, char g){/// constructor
        lastname = last;
        firstname = first;
        age = a;
        rank = r;
        id = i;
        city = c;
       gender = g;
    }///end of Person

    public void displayPerson(){
        System.out.print( "Last name: " + lastname );
        System.out.print( ", First name: " + firstname );
        System.out.print( ", Age: " + age );
        System.out.print( ", Rank: " + rank );
        System.out.print( ", ID: " + id );
        System.out.print(", City: " + city);
        System.out.println(", Gender: " + gender);
    }///end of display

    public String getLast() { ///getLast()
        return lastname;
    }///end getLastname

    public String getFirst() {
        return firstname;
    }///end getFirst()

    public int getAge(){
        return age;
    }///end getAge()

    public String getRank() {
        return rank;
    }///end getRank()

    public int getId() {
        return id;
    }///end getId()

    public String getCity() {
        return city;
    }///end getCity

    public Character getGender() {
        return gender;
    }///end getGender
}///end class Person
