import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void reverseWords(String i1,int i2)
	{
		
		if(i2==0)
		{
			String[] a=i1.split(" ");
			String[] b=new String[a.length];
			ArrayList<String> al=new ArrayList<String>();
	                  for(int i=0;i<a.length;i++)
			{
				StringBuilder sb=new StringBuilder();
		                        sb.append(a[i]);
		                     b[i]= ( sb.reverse()).toString();
                                               al.add(b[i]);
			}
			
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone j=new Ideone();
		j.reverseWords("wipro technologies bangalore",0);
	}

	}
