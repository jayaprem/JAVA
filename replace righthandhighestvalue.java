import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={7,5,6,3,4,1};
		int[] b=new int[10];
		int l=a.length;
		int t=0;
		for(int k=0;k<a.length;k++)
		{
			if(k==(l-2))
			{
				b[l-2]=a[l-1];
			}
			else if(k==(l-1))
			{
			b[l-1]=0;	
			}
			else
			{
			
					int j=k+1;
				int m=a[j];
				//System.out.println(j);
				for(int i=j+1;i<a.length;i++)
				{
				if(a[i]>m)
				{
					m=a[i];
				}
				}
				b[t]=m;
				t++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
INPUT:756341
OUTPUT:664410
