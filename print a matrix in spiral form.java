/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int sr=0,er=4;
		int sc=0,ec=4;
		int i;
		while(sr<er && sc<ec)
		{
		for(i=sc;i<ec;i++)
		{
			System.out.print(a[sr][i]+" ");
		}
		sr++;
		for(i=sr;i<er;i++)
		{
			System.out.print(a[i][ec-1]+" ");
		}
		ec--;
		if(sr<er){
		for(i=ec-1;i>=sc;i--)
		{
			System.out.print(a[er-1][i]+" ");
		}
		er--;
		}
		if(sc<ec)
		{
			for(i=er-1;i>=sr;i--)
			{	
				System.out.print(a[i][sc]+" ");
				
			}
		    sc++;
		}
	 }
   }
}
INPUT:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
OUTPUT:
 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
