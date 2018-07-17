import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n=5,m;
     for(int i=1;i<=n;i++)
     {
    	 for(int j=i;j<=n;j++)
    	 {
    		 System.out.print("\t");
    	 }
    	   
    		 for( m=1;m<=i;m++)
    		 {
    			 System.out.print("\t" +m);
    		 }
    		 for( m=i-1;m>0;m--)
    		 {
    		 System.out.print("\t" + "*");
    		 }
    	 System.out.print("\n");
    	 
     }
     for(int i=n-1;i>0;i--)
     {
    	 
    	  for(int j=1;j<=n-i+1;j++)
    	 {
    		 System.out.print("\t");
    	 }
    	  	 for( m=1;m<i;m++)
    		 {
    			 System.out.print("\t" + "*");
    		 }
    		 for( m=i;m>0;m--)
    		 {
    		 System.out.print("\t" +m);
    		 }
    	 System.out.print("\n");
    	
    	 
     }
	}
}
OUTPUT:
            1
					1	2	*
				1	2	3	*	*
			1	2	3	4	*	*	*
		1	2	3	4	5	*	*	*	*
			*	*	*	4	3	2	1
				*	*	3	2	1
					*	2	1
						1
