import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a="67243";
		System.out.println("given:"+a);
		String s=a;
	
		            while(s.length()>2)
		            {
		            		String c1="";
			for(int i=0;i<s.length()-1;i++)
			{
				int x=Integer.parseInt(String.valueOf(s.charAt(i)));
				int y=Integer.parseInt(String.valueOf(s.charAt(i+1)));
				 int g=x-y;
				 int g1=Math.abs(g);
				 c1=c1+g1;
			}
			
	                         s=c1;
	                         System.out.println(s);
		           }
		}
}
given:67243
1521
431
12
