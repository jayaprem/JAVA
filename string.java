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
		int i,j,s1=0;
		ArrayList<String> al=new ArrayList<String>();
		for(i=0;i<s.length()-1;i++)
		{
			for(j=i+1;j<s.length();j++)
			{
				d=d+s.substring(i,j+1);
			    if(!s.equals(d)) al.add(d);
			    d="";
			}
			
		}
		System.out.println(al);
	System.out.println(al.size());
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
