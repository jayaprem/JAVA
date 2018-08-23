Question:
if sum=15
output will be
2+13=count1
11+4=count2
5+10=count3
0+15=count4
9+6=count=5
total count=5
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={2,11,4,13,5,10,0,15,9,6};
		int i=0,count=0;
		int sum=15;
		for(i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if((a[i]+a[j])==sum)
			{
				count++;
			}
			}
		}
	System.out.println("count:"+count);	
	}
}
output:
count:5
