import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	int count=0,a,c,x;
	public int fun(int no)
	{
		int n=Math.abs(no);
		 x=Integer.toString(n).length();
		 if(x==1)
			a=-1;
		else
		{
		while(count!=2)
		{
			
		
		 a=n%10;
		n=n/10;
		count++;
		}
		}
	return a;	
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone i=new Ideone();
		int b=i.fun(5);
		System.out.println(b);
	}
}
return last digit of a number
197 ans 9
-197 ans 9
if only one digit it should return -1
