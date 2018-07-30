/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="world wide web";
		int i,j,sm=0;
		String sj=s.toUpperCase();
		//char[] a={'A','B,'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Z'};
		String[] s1=sj.split(" ");
		String d=" ";
		for(i=0;i<s1.length;i++)
		{
			sm=0;
			int l=s1[i].length();
			if(l%2!=0)
			{
			for(j=0;j<(l/2)+1;j++)
			{
				if(j==(l/2))
				{
					sm=sm+(int)(s1[i].charAt(j));
					//System.out.println("hi"+(s1[i].charAt(j)));
				}
				else
				{
				sm=sm+(Math.abs((s1[i].charAt(j))-(s1[i].charAt(l-(j+1)))));
				}
			}
			}
			if(l%2==0)
			{
			for(j=0;j<l/2;j++)
			{
				sm=sm+(Math.abs((s1[i].charAt(j))-(s1[i].charAt(l-(j+1)))));

			}
			}
			d=d+sm;
		}
		System.out.println(d);
	
}
}
output:
world wide web
(w-d+o-l+r)+(w-e+i-d)+(w-b+e)
104+23+90
1042390
