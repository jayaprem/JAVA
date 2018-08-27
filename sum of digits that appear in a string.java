QUESTION:
return the sum of the digits that appear in a string

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="aa1bc2d3";
		int i=0,sum=0;
		for(i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sum=sum+Integer.parseInt(Character.toString(s.charAt(i)));
			}
		}
		System.out.println(sum);
	}
}
OUTPUT:
6(1+2+3)
