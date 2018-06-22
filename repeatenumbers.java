import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="jaya lakshmi";
		int count=0;
		for(int i=0;i<=s.length();i++)
		{
			for(int j=1;j<=s.length();j++)
			{
				char a=s.charAt(i);
				char b=s.charAt(j);
				if(a==b)
				{
					count++;
				}
			}
			if(count>0)
			{
				char c=s.charAt(i);
				System.out.println(c);
			}
		}
	}
}
