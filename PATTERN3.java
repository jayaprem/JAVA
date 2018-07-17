public class pattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,m;
		char a[]={'A','B','C','D'};
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=i;j<=n;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	   
	    		 for( m=1;m<=i;m++)
	    		 {
	    			 System.out.print(m);
	    		 }
	    		 for( m=i-1;m>0;m--)
	    		 {
	    		 System.out.print(a[m-1]);
	    		 }
	    	 System.out.print("\n");
	    	 
	     }
		}

	}
  
  
  OUTPUT:
     1
    12A
   123BA
  1234CBA
 12345DCBA
