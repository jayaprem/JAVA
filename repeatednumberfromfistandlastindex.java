import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={1,2,4,1,2,8,6,7,8};
		int temp=0;
		int s=0;
		int[] b=new int[5];
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count++;	
				}
			}
			if(count>1)
			{
				temp++;
				b[s]=a[i];
				s++;
			}
			
		}
    //from last index
		System.out.print(b[temp-1]);
    //from first index
    System.out.print(b[0]);
    
	}
}
