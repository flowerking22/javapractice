public class pol{
    public static void main(String args[]){


        char[] a=new char[4];
        char[0] a= new char[]{'a'};
        char[1] a='m';
        char[2] a='m';
        char[3] a='a' ;
        char[] b;
        int n= a.length();
        for(i=0;i<n/2;i++){
            b[n-1-i]=a[i];
            b[i]=a[n-1-i];
        }


        if (a==b){
            System.out.println("poly");
        }
        else
            System.out.println("not poly");
    }
}
