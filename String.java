import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t=0;
		String s1="wipro technologies bangaluru";
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String[] c=s2.split(" ");
		String[] a=s1.split(" ");
		String[] b=new String[a[t++].length()];
	
		for(int i=0;i<a.length;i++)
		{
			String y1=a[i].substring(1);
			char x=a[i].charAt(0);
			char j=Character.toUpperCase(x);
		             b[i]=j+y1;
			System.out.print(b[i]+"\t");
			/*s.add(b[i]);*/
		}
		System.out.print("\n");
		for(int j=a.length-1;j>=0;j--)
		{
			int l=b[j].length();
			for(int k=l-1;k>=0;k--)
			{
			System.out.print(b[j].charAt(k));
			}
		}
		System.out.print("\n");
            	for(int i=0;i<c.length;i++)
		{
			String y1=c[i].substring(1);
			char x=a[i].charAt(0);
			char j=Character.toLowerCase(x);
		             b[i]=j+y1;
			System.out.print(b[i]+"\t");
		}
	
	}
}
