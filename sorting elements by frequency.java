/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][3];
		for(int e=0;e<n;e++)
		{ 
			a[e][0]=in.nextInt();
			a[e][2]=e;
		}
		int c=0,i=0,j=0,temp=0,k;
		for(i=0;i<n;i++)
		{
			c=0;
		for(j=0;j<n;j++)
		{
			if(a[i][0]==a[j][0])
			c++;
			a[i][1]=c;
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i][1]<a[j][1])
			{
				for(k=0;k<3;k++)
				{
				temp=a[i][k];
				a[i][k]=a[j][k];
				a[j][k]=temp;
				}
				
				
			}
		}
	}
for(i=0;i<n;i++)
{
  for(j=0;j<n;j++)
	{
	if(a[i][1]==a[j][1])
		{
			if(a[i][2]<a[j][2])
			{
				for(k=0;k<3;k++)
				{
				temp=a[i][k];
				a[i][k]=a[j][k];
				a[j][k]=temp;
				}
			}
		}
	}
}
		
	for(i=0;i<n;i++)
	{
		System.out.println(a[i][0]);
	}
	}
}
