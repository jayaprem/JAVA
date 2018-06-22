public class Ideone {
	public static int output1=0;
	public static int output2=0;
	public static int count=0;
	

	
		public int add(String input1)
		{
			 
				String[] x=input1.split(" ");
               int[] a=new int[x.length];
		for(int i=0;i<x.length;i++)
				
		{
					
		 a[i]=Integer.parseInt(x[i]);
								
		if(a[i]%2==0)
					
		{
						
		output1=output1+a[i];
					
		}
					
		else
					
		{		
		output2=output2+a[i];
					
		}
		}	
		return output1;
	
		}
		public static void main(String[] args) {
			Ideone i=new Ideone();
			int k=i.add("1 2 3 4 5 6 7 8");
			System.out.println(k);
			
			

	}

}
