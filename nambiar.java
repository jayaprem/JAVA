/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={9,8,8,0,1,2,7,4,3,1};
		int i=0,j,sum=0,t;
		String s="";
		t=i;
		while(t<=a.length)
		{
			if(a[i]%2!=0)
			{
				while(sum%2==0)
				{
				for(j=0;j<a.length-1;j++)
                                                {
				sum=sum+a[j];
				i++;
                                                }
				}
				t=i;
				s=s+sum;
				sum=0;
				a[i]=a[t];
				
			}
			else if(a[i]%2==0)
			{
				while(sum%2!=0)
				{
					for(i=0;i<a.length;i++)
                                                            {
					sum=sum+a[i];
					i++;
                                                            }
				}
				t=i;
				s=s+sum;
				sum=0;
				a[i]=a[t];
			}
		}
		System.out.println(s);
	}
}
