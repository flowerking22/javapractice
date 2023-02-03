import java.until.* ;


public class prime{
    public static void main(String args []){
        int a;
        Scanner myObj=new Scanner(System.in);
        System.out.println("success the java program ");
        System.out.println("enter a value to iedentify prrime or not prime");
        a=myObj.nextline();
        int i;
        if (a==1){
            System.out.println("no is not prime or  prime");
        }
        for (i=2;i<a;i++){
            if(a%i==0){
                System.out.println("the number is unprime number");
                break;
            }
            if(i>a/2){
             System.out.println("the number is prime number");
              break;
            }
        }
        
        
    }

}