/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="account",g="";
		int i,j,t=0,s1=0;
		ArrayList<String> al=new ArrayList<String>();
		for(i=0;i<s.length();i++)
		{
			String d="";
			int c=0;
			for(j=i;j<s.length();j++)
			{
				d=d+s.charAt(j);
				c++;
				
				if(c>1)
				{
					if(!s.equals(d))
			                        {
					al.add(d);
					t++;
			                        }
				}
				
			}
		}
		System.out.println(al);
	System.out.println(t);
	for(i=0;i<al.size();i++)
	{
		if(al.get(i).contains("c")){
		s1++;
		}
	}
	System.out.println(s1);
}
}
output:
[ac, acc, acco, accou, accoun, cc, cco, ccou, ccoun, ccount, co, cou, coun, count, ou, oun, ount, un, unt, nt]
20
14
