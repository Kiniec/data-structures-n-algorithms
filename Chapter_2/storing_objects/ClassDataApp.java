package Chapter_2.storing_objects;

public class ClassDataApp {
    public static void main(String[]ars){
        int maxSize =100 ; ///array size
        DataArray arr1 = new DataArray(maxSize); ///create object
                                                        ///reference to array and create array
       ///insert 10 items
        arr1.insert("Evans", "Patty", 24);
        arr1.insert("Smith","Lorriane" , 37);
        arr1.insert("Yee", "Tom", 43);
        arr1.insert("Adams","Henry",63);
        arr1.insert("Hashimoto","Sato",21);
        arr1.insert("Stimson", "Henry", 29);
        arr1.insert("Velasquez","Jose",72);
        arr1.insert("Lamarque","Henry",54);
        arr1.insert("Vang","Minh",22);
        arr1.insert("Creswell","Lucinda", 18);

        arr1.displayA(); ///display items
        String searchKey = "Stimson"; ///search for item
        Person found;
        found = arr1.find(searchKey);
        if(found != null){
            System.out.println("Found");
            found.displayPerson();
        }///end if
        else{
            System.out.println("Can't find" + searchKey);
            }///end else

        System.out.println("Deleting Smith, Yee, and Creswell");
                ///delete 3 items

        arr1.delete("Smith");
        arr1.delete("Yee");
        arr1.delete("Creswell");

        arr1.displayA();


    }///end main()
}///end ClassDataApp
