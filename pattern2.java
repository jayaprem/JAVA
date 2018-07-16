import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int c=1;
		for(int k=a;k>=1;k--)
		{
			int t=0;
			for(int i=1;i<k;i++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=c;j++)
			{
				
				System.out.print(j);
				t++;
			}
			for(int l=t-1;l>0;l--)
			{
			System.out.print(l);	
			}
			System.out.print("\n");
			c=c+1;
		}
	}
}
