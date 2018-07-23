/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=6,m,c=0,k,l=1;
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=i;j<=n;j++)
	    	 {
	    		 System.out.print("\t");
	    	 }
	    	     c++;
				
					
					for( m=l;m<=c;m++)
		    		 {
		    			 
		    			 
		    				 System.out.print("\t"+m);
		    			 
		    		 }
		    		 for( m=c-1;m>=l;m--)
		    		 {
		    			 
		    			 
		    				 System.out.print("\t"+m);
		    			 
		    		 }
			
				c=c+1;
				l++;
	    		 
	    	 System.out.print("\n");
	     }
	}
}
output:
              1
						2	3	2
					3	4	5	4	3
				4	5	6	7	6	5	4
			5	6	7	8	9	8	7	6	5
		6	7	8	9	10	11	10	9	8	7	6

