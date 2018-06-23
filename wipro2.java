import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public int a1,i,large,count=0,l,f,sum;
	int[] k=new int[10];
	

	public void find(int[] x)
	{
		
		for(i=0;i<x.length;i++)
		{
				large=0;
	            
		while(x[i]>0)
		{
		
		a1=x[i]%10;
		if(a1>=large)
		{
			large=a1;
			k[i]=large;
			
		}
		x[i]=x[i]/10;
		}
		count++;
		System.out.println(large);
		}
		
	}
	public void large()
	{
	
		l=0;
		for(int i=0;i<count;i++)
		{
		if(k[i]>=l)	
		{
			l=k[i];
		}
		
		}
		System.out.println(l);
	}
	public void facandsum()
	{
		 f=1;
		for(int k=1;k<=l;k++)
		{
			 f=f*k;
		}
			System.out.println(f);
			 sum=f+l;
	}
	public void print()
	{
			
			System.out.println(sum);
			System.out.println(l);
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
             Ideone i=new Ideone();
             int a[]={123,227,987};
             i.find(a);
             i.large();
             i.facandsum();
             i.print();
	}
}
1 . Find the largest digit in all the given input numbers
For Example , if n1=123 , n2 = 227, n3 = 987
Largest digit in n1 = 3
Largest digit in n2 = 7
Largest digit in n3 = 9
2 . Find the FACTORIAL of the LARGEST among the largest digits.
In the above Example, Find Factorial of 9.
3 . Calculate the sum of FACTORIAL VALUE obtained in Step-2 and the Largest Value(9)
4 . Print the SUM and the LARGEST NUMBER(9) Value.
