Given an n-by-n matrix of 0’s and 1’s where all 1’s in each row come before all 0’s.
find the most efficient way to return the row with the maximum number of 0’s.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] a={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
		int i,j,r=4,c=4,ct;
		int[][] b=new int[r][2];
		for(i=0;i<r;i++)
		{
			ct=0;
			for(j=0;j<c;j++)
			{
				if(a[i][j]==0) ct++;
			}
			a[i][0]=i;
			a[i][1]=ct;
		}
		int max=0,index=0;
		for(i=0;i<r;i++)
		{
			if(a[i][1]>max)
			{
				max=a[i][1];
				index=a[i][0];
			}
		}
		System.out.println("row:"+index);
	}
}
