import java.util.*;

class HalfPyramid{
  public static void main(String args[]){
    //t r=4;
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    System.out.println("------Half Pyramid---------\n You Selected Rows is "+r);
    for (int i=1;i<=r;i++){
      for (int j=1;j<=i;j++){    /*   for(int j=0;j<=r-i;j++){     */
      
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


Output:

------Half Pyramid---------
 You Selected Rows is 5
*
**
***
****
*****
https://onecompiler.com/java/3yurfg894
