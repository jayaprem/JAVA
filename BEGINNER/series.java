import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            
       
        for(int j=0;j<t;j++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           for(int i=0;i<n;i++)
           {
            
             a += b * (int) Math.pow(2, i);;
            System.out.print(a+" ");
          
          }
            System.out.println();
        }
        
         in.close();
    }
}
/*when we use a=0,b=2,n=3
series:(a+2^0.b),(a+2^0.b+2^1.b),(a+2^0.b+2^1.b+2^2.b)..................
that is
s0=0+2^0.2;
s1=0+2^0.2+2^1.2;
s2=0+2^0.2+2^1.2+2^2.2;*/
