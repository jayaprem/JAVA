import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="1ab23cd1jk";
		String st="";
		int s1=0;
		int t=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				st=st+c;
				t++;
			}
			else if(Character.isLetter(c))
			{
				if(t>0)
				{
				s1=s1+Integer.parseInt(st);
				st="";
				t=0;
				}
			}
		}
		if(t>0)
		{
		s1=s1+Integer.parseInt(st);
		System.out.println(s1);
		}
		else
		{
			System.out.println(s1);
		}
	}
}
Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.
Input: The first line of input contains an integer T denoting the number of test cases. Then T test cases
follow. Each test case contains a string containing alphanumeric characters.
Output: Print the sum of all numbers present in the string.

Example:
Input: 4
1abc23
psna4cse
1abc2x30yz67
123abc

Output:
24
4
100
123
