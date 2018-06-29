import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
String s="abc\t\ndef   ghi";
String s1="one   two   three  \t  four";
String[] w = s.split("[ \n\t\r.,;:!?(){]");
String[] w1 = s1.split("[ \n\t\r.,;:!?(){]");
int t=0,k=0;
for(int i=0;i<w.length;i++)
{
	t++;
	System.out.print(w[i]);
	if(t<w.length)
	{
	System.out.print(" ");
	}
}
System.out.print("\n");
for(int i=0;i<w1.length;i++)
{
	k++;
	System.out.print(w1[i]);
	if(k<w1.length)
	{
	System.out.print(" ");
	}
}	
}
}
