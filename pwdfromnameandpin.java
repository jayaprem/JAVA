
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n=sc.nextInt();
		int N=sc.nextInt();
		ArrayList<String> al=new ArrayList<String>();
		String lname,sname;
		if(s1.length()>s2.length())
		{
			 lname=s1;
	                         sname=s2;
		}
		else if(s2.length()>s1.length())
		{
		lname=s2;
		sname=s1;
		}
		else 
		{
			if(s1.charAt(0)>s2.charAt(0))
			{
				lname=s1;
				sname=s2;
			}
			else if(s1.charAt(1)>s2.charAt(1))
			{
				lname=s2;
				sname=s1;
			}
			else
			{
				lname=s1;
				sname=s2;	
			}
		}
		System.out.println("large":+lname);
		System.out.println("Small"+sname);
		String s3=String.valueOf(n);
		al.add(lname.charAt(0)+""+sname+""+s3.charAt(N-1)+""+s3.charAt(s3.length()-N));
		char[] c=al.get(0).toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLowerCase(c[i]))
			{
			System.out.print(Character.toUpperCase(c[i]));	
			}
			else
			{
			System.out.print(Character.toLowerCase(c[i]));	
			}
		}
	}
}
Input:
Manoj
Kumar
561327
2
output:
Large:Manoj
Small:Kumar
mkUMAR62(first letter of large name+sname+poistion(N) in pin(from left to right)+(from right to left) 
