package java_tutorial;

public class IfStatements {
    public static void main(String[] args){
      int x = 5 ;
      int y = 5 ;
      //one way
      if(x==y){
          System.out.println("Equal");
      }

      //two way
      if(x==y){
        System.out.println("Equal");
      }
      else {
        System.out.println("Not Equal");
      }

      //multi-way
      if (x>y){
          System.out.println(x);
      }
      else if (x>y){
          System.out.println(y);
      }
      else{
          System.out.println("equal");
      }

    } //end of switch statment


}// end of class
