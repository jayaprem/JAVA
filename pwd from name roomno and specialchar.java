QUES:
Room no starts from 100 AND ends with 999
Unit digit = unit place in name
10 th place =room no's 10th place
100 th place=sum or room no compared to special char
1000th place=sum of room no
Length pwd is 4
EXAMPLE:
Name:bala
Room no:106
Special symbol:{!,@,#,$,%,^,&,*,(,)}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String n="bala";
		int r=106,s=0,t=0,t1=0;
		String p="";
		char[] s1={'!','@','#','$','%','^','&','*','(',')'};
		while(r>9)
		{
		while(r>0)
		{
			int a=r%10;
			t++;
			if(t==2)
			{
			t1=a;	
			}
			s=s+a;
			r=r/10;
		}
			if(s>9)
			{
				r=s;
				s=0;
			}
		}
	p=s+""+s1[s-1]+""+t1+""+n.charAt(n.length()-1);
	System.out.println(p.trim());
	}
}
OUTPUT:
7&0a
