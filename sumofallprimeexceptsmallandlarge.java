import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={10,41,18,50,43,31,29,25,59,96,67};
		Arrays.sort(a);
		int temp=0;
		int s=0;
		int sum=0;
		int[] b=new int[16];
		for(int i=0;i<a.length;i++)
		{
			int count=0;
		for(int j=2;j<=a[i]/2;j++)
		{
			if(a[i]%j==0)
			{
			count=1;	
			}
		}
		if(count==0)
		{
			temp=temp+1;
		b[s]=a[i];
		s++;
		}
	            }
	            System.out.println("except small no");
	            for(int k=1;k<temp;k++)
	            {
	            	sum=sum+b[k];
	            }
	            System.out.println(sum);
	            /*System.out.println("except max no");
	            for(int k=0;k<temp-1;k++)
	            {
	            	sum=sum+b[k];
	            }
	            System.out.println(sum);*/
	}
}
