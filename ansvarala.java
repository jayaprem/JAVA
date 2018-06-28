import java.io.*;
import  java.util.*;
import java.lang.*;

class UserMainCode
{

    public static String output1;
	    
				
    public static void reverseWords_andCase(String input1,int input2){
        String b[]=new String[20];
		ArrayList<String> al=new ArrayList<String>();
		String[] a=input1.split(" ");
		if(input2==0)
		{
			for(int i=0;i<a.length;i++)
			{
				
				al.add(new StringBuilder(a[i]).reverse().toString());
			}
				String h="";
			for(String f:al)
			{
				h+=f+"\t";
			}
			
			output1=h.trim();
			System.out.print(output1);
		}
	}
}
