import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="jajaiouiou";
		ArrayList<Character> x=new ArrayList<Character>();
		int temp;
		char[] b=new char[50];
		char[] a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(a[i]==a[j])
				{
				count++;	
				}
			}
			if(count>1)
			{
				x.add(a[i]);
			}
		}
		Set<Character> s1=new LinkedHashSet<Character>(x);
		System.out.println(s1);
		
	}
}
