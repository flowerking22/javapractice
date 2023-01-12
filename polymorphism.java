
    Polymorphism
Polymorphism gives the meaning many forms, usually it occurs when multiple classes are present and have been inherited.

   Consider an example of installing an application in your mobile, where your base class is Mobile and
method is installation() and its derived classes could be installApp1, installApp2, installApp3 etc 
which will have its own implementation but installation method can be common which can be inherited from its base class.

class Honda3 extends Bike{  
 String speedlimit="Honda3 limit is 150";  
  public String method(){
    return "Hondo3";
  }
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println("variable is ----\n "+obj.speedlimit);//90  
  System.out.println("methods is ----\n"+obj.method());
}  
}
class Bike{  
String speedlimit="Bike limit is 90";  
 public String method(){
  return "Bike";
 }
}  



Output:

variable is ----
 Bike limit is 90
methods is ----
Hondo3



class Honda3 extends Bike{  
 String speedlimit="Honda3 limit is 150";  
  public String method(){
    return "Hondo3";
  }
  public void hondo(){
    System.out.println("I'M From Honda");
  }
   // public void hondo(){
  //   System.out.println("I'M From Honda");
  // }
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println("variable is ----\n "+obj.speedlimit);//90  
  System.out.println("methods is ----\n"+obj.method());
  obj.hondo();
}  
}
class Bike{  
String speedlimit="Bike limit is 90";  
 public String method(){
  return "Bike";
 }
   public void hondo(){
    System.out.println("I'M From Bike");
  }
}  


Output:

variable is ----
 Bike limit is 90
methods is ----
Hondo3
I'M From Honda
//I'M From Bike
