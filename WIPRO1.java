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
		int i=0,j=0,c=0,k=0,m=0;
		for(i=0;i<4;i++)
		{
	c++;
	m=r*c;
			for(j=0;j<4;j++)
			{
				a[i][j]=m;
				m=m+cl;
			}
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				b[i][j]=a[j][i];
				//System.out.print(b[i][j]+" ");
			}
			//System.out.println();
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
			
					d[i][j]=a[i][j]*b[i][j];
			}
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(d[i][j]);
				if(j<3)
				System.out.print(" ");
			}
			if(i<3)
			System.out.println();
		}
	}
}
OUTPUT:
INPUT: 4 1
16 40 72 112
40 81 130 187
72 130 196 270
112 187 270 361
INPUT:3 5
9 48 117 216
48 121 224 357
117 224 361 528
216 357 528 729
