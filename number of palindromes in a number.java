INPUT:
Given a large number as input,break the number into adjacent three digit numbers and find the numbers of three digit number which are palindromes.
If there are no palindromes after splitup,display the count as 0. 
If the input number is 12125191,all adjacent three digit numbers will be 121,212,125,251,519
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="12125191";
		String d="";
		int i,j,count=0;
		String[] c=new String[s.length()-2];
		if(s.length()>=3){
		for(i=0;i<s.length()-2;i++)
		{
			d=d+s.charAt(i);
			for(j=i+1;j<=i+2;j++)
			{
				d=d+s.charAt(j);
			}
			c[i]=d;
			d="";
		}
		for(i=0;i<c.length;i++)
		{
			StringBuilder sb=new StringBuilder(c[i]);
			String g=sb.reverse().toString();
			if(g.equals(c[i])) count++;
	}
		if(count!=0)
		System.out.println(count);
		else System.out.println("0");
	}
	else System.out.println("Invalid Input");	 
	}
}
