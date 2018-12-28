/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,x=1,t=1,l,max;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m=new int[n];
		for (l=0;l<n;l++)
		m[l]=sc.nextInt();
		max=m[0];
		for(l=0;l<n;l++)
		{if(m[l]>max)
		 max=m[l];
		}
		int[] a=new int[max];
		
		for(i=0;i<max;i++)
		{
			if(i%2==0)
			{
				a[i]=(int)Math.pow(2,x);
				x=x*2;
			}
			if(i%2!=0)
			{
				a[i]=(int)Math.pow(2,t);
				t=t*3;
			}
		}
		
		for(int g=0;g<n;g++)
		{
		for(i=0;i<max;i++)
		{if(i+1==m[g])
		System.out.println(a[i]);
		}
		}
	}
}
Given the series as follows 2 2 4 8 16 512....... Identify the nth term of the series. Answers can be very large use BigInt in Java.
Input:
First line consists of Q queries. Each of the next Q lines contain a number N which represents the Nth term of the series.
Output:
Output the Nth term of the series.
Constraints:
1<=Q<=50
1<=N<=12
Example:
Input:
2
4
7
Output:
8
256

