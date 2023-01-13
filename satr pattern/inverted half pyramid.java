Print The Pattern:-
      *
     **
    ***
   ****

import java.util.*;

class InvertedPyramid{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    invertedpyramid(r);
    
  }
  public static void invertedpyramid(int r){
    for (int i=1;i<=r;i++){
      for(int j=i;j<r;j++){     /*   for(int j=0;j<=r-i;j++){     */
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


Output:

   *
  **
 ***
****
