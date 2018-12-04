/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	static void recur(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			recur(n+1);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int x=1;
		recur(x);
		
	}
}
