/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int cl=sc.nextInt();
		int[][] a=new int[4][4];
		int[][] b=new int[4][4];
		int[][] d=new int[4][4];
		int i=0,j=0,c=0,k=0,m;
		for(i=0;i<r;i++)
		{
	c++;
	m=r*c;
			for(j=0;j<cl;j++)
			{
				a[i][j]=m++;
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<cl;j++)
			{
				b[i][j]=a[j][i];
				//System.out.print(b[i][j]+" ");
			}
			//System.out.println();
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<cl;j++)
			{
			
					d[i][j]=a[i][j]*b[i][j];
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<cl;j++)
			{
				System.out.print(d[i][j]);
				if(j<cl-1)
				System.out.print(" ");
			}
			if(i<r-1)
			System.out.println();
		}
	}
}
