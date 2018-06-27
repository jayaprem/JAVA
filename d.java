import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public  void decreasingSeq(int[] input1)
	{
             int[] b=new int[11];
             int[] c=new int[11];
             int j=0;
             int count=0;
		for(int i=0;i<input1.length-1;i++)
		{
			if((input1[i]>input1[i+1])||(input1[i]<input1[i-1]))
			{
				count++;
				b[j]=input1[i];
				j++;
				
				
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(b[i]);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone i=new Ideone();
		int a[] = {11,4,3,1,4,7,8,12,2,3,7};
		i.decreasingSeq(a);
	}
}
