/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int i,sc=0,ec=5,sr=0,er=5;
		while(sr<er)
		{
		for(i=sc;i<ec;i++) System.out.print(a[sr][i]+" ");
		sr++;
		if(sr<er)
		{
		for(i=ec-1;i>=sc;i--)
		{
			System.out.print(a[sr][i]+" ");
		}
		sr++;
		}
		}
	}
}
input:
1 2 3 4 5->
6 7 8 9 10<-
11 12 13 14 15->
16 17 18 19 20<-
21 22 23 24 25->
output:
1 2 3 4 5 10 9 8 7 6 11 12 13 14 15 20 19 18 17 16 21 22 23 24 25
