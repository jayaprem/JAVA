/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=0,j=0,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1 && n%i==0)
			{
			System.out.println(i);
			}
		}
	}
}
