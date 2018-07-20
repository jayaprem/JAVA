
public class pyramid5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,k,j,c=0,t=7;
		char[] a={'A','B','C','D'};
		for(i=1;i<=n;i++)
		{           
		
			for(j=i;j<=n;j++)
			{
				System.out.print("\t");
				
			}
			c++;
			for(k=1;k<=c;k++)
			{
				System.out.print("\t"+i);
			}
			c=c+1;
			System.out.println("\n");
		            	
		}
		for( i=n-1;i>0;i--)
	     {
	    	 
	    	  for( j=1;j<=n-i+1;j++)
	    	 {
	    		 System.out.print("\t");
	    	 }
	    	  	 for( int m=1;m<=t;m++)
	    		 {
	    			 System.out.print("\t" + a[i-1]);
	    		 }
	    	  	 t=t-2;
	    	  	System.out.println("\n");

	     }
	}

}

OUTPUT:
						1

					2	2	2

				3	3	3	3	3

			4	4	4	4	4	4	4

		5	5	5	5	5	5	5	5	5

			D	D	D	D	D	D	D

				C	C	C	C	C

					B	B	B

						A

