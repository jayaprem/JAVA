ncr=n!/((n-r)!*r!)

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	static int fac(int x)
	{ int sum=1;
		if(x==0)
		sum=1;
		else
		while(x>0)
		{
		sum=sum*x;
		x--;
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int ncr=fac(n)/(fac(n-r)*fac(r));
		System.out.println("o/p:"+ncr);
	}
}
OUTPUT:
5
1 
o/p:5
