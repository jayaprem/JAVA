import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Character> s=new ArrayList<Character>();
		String s1="wipro technologies bangaluru";
		System.out.println(s1.toUpperCase());
		String[] a=s1.split(" ");
	
		for(int i=0;i<s1.length();i++)
		{
			String y1=a[i].substring(1);
			char x=a[i].charAt(0);
			char j=Character.toTitleCase(x);
			System.out.print(j+y1);
			
		}
	
	}
}
