/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={17,28,25,17,12,13,19,24,20};
		int i,j,c;
		ArrayList al=new ArrayList();
		for(i=0;i<a.length;i++)
		{
			c=0;
			if(i>1)
			{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c=1;
				}
			}
			if(c==0)
			al.add(a[i]);
			}
		}
		System.out.println(al);
	}
}
OUTPUT:
[25, 17, 13, 24]
