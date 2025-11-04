package Exams.Exam_1_2025;

public class Car {
     private String make;
     private String model;
     private int year;

     public Car(String me, String ml, int yy) {
         make = me;
         model = ml;
         year = yy;
     }///end Car

    public String getMake() {
        return make;
    }///end getMake

    public String getModel() {
        return model;
    }///end getModel

    public int getYear() {
        return year;
    }///end getYear

    public void displayC(){
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);



    }///end display
}///end class Car

