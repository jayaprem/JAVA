QUESTION:
Find an index in an array such that the sum of elements at its left side is equal to the sum of elements at its right side

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n=8,i=1,j,k,sum1=0,sum2=0;
	int[] a={12,0,3,2,4,1,0,2};
	while(i<n-1)
	{
		sum1=0;sum2=0;
		for(j=i+1;j<n;j++)
		{
			sum1=sum1+a[j];
			//System.out.println("j"+sum1);
		}
		for(k=i-1;k>=0;k--)
		{
			sum2=sum2+a[k];
			//System.out.println("k"+sum2);
		}
		if(sum1==sum2)
		{
			System.out.println("index:"+i);
		}
		i++;
	}
	}
}
OUTPUT:
index:1
