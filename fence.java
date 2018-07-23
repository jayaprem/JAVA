import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="atc toctaka ne";
		int k=2;
		int i,j=0,t=0,s1=0;
		char[] b=new char[15];
		for(i=0;i<s.length();i++)
		{
			
			if(t<=12)
			{
				//System.out.print(t);
				b[t]=s.charAt(j);
		                        t=t+k;
				j++;
			}
			if(t>12)
			{
				
			if(t==13)
			{
				b[t]=s.charAt(j);
			}
			else
			{
			             s1=t-13;
				b[s1]=s.charAt(j);
	                                   t=s1+k;
				j++;
			}
			}
		
		}
		for(i=0;i<s.length();i++)
		{
			System.out.print(b[i]);
		}
		
	}
}
