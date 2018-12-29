USING HASHSET AND ARRAYLIST:
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String k="characters";
		String k1="alphabets";
		char a[]=k.toCharArray();
		char b[]=k1.toCharArray();
		Set s=new HashSet();
		Set s1=new HashSet(); 
		Set s3=new HashSet();
		for(char l:a)
		{
			s.add(l);
		}
		for(char b1:b)
		{
			s1.add(b1);
			if(!s.contains(b1))
			{
				s3.add(b1);
			}
		}
		for(char a1:a)
		{
			if(!s1.contains(a1))
			{
				s3.add(a1);
			
		}	}
	ArrayList al=new ArrayList(s3);
	Collections.sort(al);
	Iterator<Character> it = al.iterator();
	while(it.hasNext()){
	System.out.print(it.next());
	}
}
}
USING TREESET :
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String k="characters";
		String k1="alphabets";
		char a[]=k.toCharArray();
		char b[]=k1.toCharArray();
		Set s=new HashSet();
		Set s1=new HashSet(); 
		SortedSet s3=new TreeSet();
		for(char l:a)
		{
			s.add(l);
		}
		for(char b1:b)
		{
			s1.add(b1);
			if(!s.contains(b1))
			{
				s3.add(b1);
			}
		}
		for(char a1:a)
		{
			if(!s1.contains(a1))
			{
				s3.add(a1);
			
		}	}
	Iterator<Character> it = s3.iterator();
	while(it.hasNext()){
	System.out.print(it.next());
	}
}
}

. Find and print the uncommon characters of the two given strings. Here uncommon character means that either the character is present in one string or it is present in other string but not in both. The strings contain only lowercase characters and can contain duplicates.

Input: The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two strings.
Output: Print the uncommon characters of the two given strings in sorted order.
Example:
Input: 
characters
alphabets
Output: bclpr
USING STRING:
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String k="characters";
		String k1="alphabets";
		String s="";
		int i,j;
	for(i=0;i<k.length();i++)
	{
		for(j=0;j<k1.length();j++)
		{
			if(k.charAt(i)==k1.charAt(j)) s=s+k.charAt(i);
		}
	}
	for(i=0;i<s.length();i++)
	{
		String g=Character.toString(s.charAt(i));
	k=k.replaceAll(g,"");
	k1=k1.replaceAll(g,"");
	}
	System.out.println(k+""+k1);
}
}
output:crcrlpb
