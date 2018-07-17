public class pattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,c=1;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("\t");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print("\t" +i);
			}
			c=c+2;
			System.out.println();
			
		}

	}

}


OUTPUT:
          5
				4	4	4
			3	3	3	3	3
		2	2	2	2	2	2	2
	1	1	1	1	1	1	1	1	1
