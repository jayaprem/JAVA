import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public int a1,i,small,count=0,s,f,sum,n;
	int[] k=new int[10];
	

	public void find(int[] x)
	{
		
		for(i=0;i<x.length;i++)
		{
				small=9;
				n=x[i];
	            
		while(x[i]>0)
		{
			
		a1=x[i]%10;
		if(a1<=small)
		{
			small=a1;
			k[i]=small;
			
		}
		x[i]=x[i]/10;
		}
		count++;
		System.out.format("the smallest digit of %d%n is %d%n",n,small);
		}
		
	}
	public void small()
	{
	
		s=9;
		for(int i=0;i<count;i++)
		{
		if(k[i]<=s)	
		{
				s=k[i];
		}
		
		}
		System.out.format("the SMALLEST digit is:%d%n",s);
	}
	public void facandsum()
	{
		 f=1;
		for(int k=1;k<=s;k++)
		{
			 f=f*k;
		}
			System.out.format("factorial of smallest digit %d%n is %d%n",s,f);
			 sum=f+s;
	}
	public void print()
	{
			
			System.out.println("sum:"+sum);
			System.out.println("the smallest value :"+s);
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
             Ideone i=new Ideone();
             int a[]={397,123,674};
             i.find(a);
             i.small();
             i.facandsum();
             i.print();
	}
}

1 . Find the Smallest digit in all the given input numbers
For Example , if n1=123 , n2 = 227, n3 = 987
Smallest digit in n1 = 1
Smallest digit in n2 = 2
Smallest digit in n3 = 7
2 . Find the FACTORIAL of the SMALLEST among the Smallest digits.
In the above Example, Find Factorial of 1.
3 . Calculate the sum of FACTORIAL VALUE obtained in Step-2 and the Smallest Value(1)
4 . Print the SUM and the SMALLEST NUMBER(1) Value.
