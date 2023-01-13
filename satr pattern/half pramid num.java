import java.util.*;
class Pyramid{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    halfnumbers(r);
    
  }
  static void halfnumbers(int r){
  System.out.println("----half Pyramid with Numbers-----\n n is "+r);
  for (int i=1;i<=r;i++){
     for(int j=1;j<=i;j++){
       System.out.print(j);
     }
     System.out.println();
  }
}
}


Output:

----half Pyramid with Numbers-----
 n is 7
1
12
123
1234
12345
123456
1234567
