import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={10,41,18,50,43,31,29,25,59,96,67};
		Arrays.sort(a);
		int temp=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
		for(int j=2;j<=a[i]/2;j++)
		{
			if(a[i]%j==0)
			{
			count=1;	
			}
		}
		if(count==0)
		{
			temp=temp+1;
			if(temp>1)
			{
				sum=sum+a[i];
			}
		}
		}
		System.out.println(sum);
		
	}
}
