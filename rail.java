/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
 char[] a=new char[10];
 char[] b=new char[10];
for(i=0;i<s1.length();i++)
{
if(i%2==0)
{
a[i]=s1.charAt(i);
}
if(i%2!=0)
{
b[i]=s1.charAt(i);
}
}
for(i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
for(i=0;i<b.length;i++)
{
System.out.print(b[i]);
}
System.out.print("\nDECRYPTION\n");
for(i=0;i<s1.length();i++)
{
System.out.print(a[i]+""+b[i]);
}

	}
}
output:
wloeecm
DECRYPTION
welcome
