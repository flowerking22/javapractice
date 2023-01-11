import java.util.*;

public class Main {
 static int x=5;
    public static void main(String[] args) {
    System.out.println("-----------Main Code----------");
   
    System.out.println(Main.x);
 hello();
  Outer.hello();
 Main main=new Main();
  System.out.println(main.x);
 main.hellom();
 Outer outer=new Outer();
 outer.hellom();

  }
  static void /*String*/ hello(){
         System.out.println("Hello,  static , Main");
         //return "0";
  }
   void /*String*/ hellom(){
         System.out.println("Hello , method , Main");
         //return "0";
  }
}class Outer{
  protected static void /*String*/ hello(){
         System.out.println("Hello,  static , Outer");
         //return "0";
  }
