import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
int a;
int[] k=new int[4];
int[] l=new int[4];
int[] p=new int[4];
int[] q=new int[4];
int[] r=new int[4];
int[] s=new int[4];
public  void findPass(int input1,int input2,int input3,int input4)
{
				int x[]={input1,input2,input3,input4};
			for(int i=0;i<x.length;i++)
			{
					int count=0;
			while(x[i]>0)
			{
			 a=x[i]%10;
                                     count++;
			if(count==1)
			{
				 p[i]=a;
				 
			}
			else if(count==2)
			{
				 q[i]=a;
			}
			else if(count==3)
			{
				 r[i]=a;
			}
                                   else 
			{
				s[i]=a;
			}
			x[i]=x[i]/10;
			}
			}
			Arrays.sort(p);
			Arrays.sort(q);
			Arrays.sort(r);
			Arrays.sort(s);
			System.out.println("password is:");
			System.out.println(s[3]+"\t"+r[3]+"\t"+q[3]+"\t"+p[3]);
}
	public static void main (String[] args) throws java.lang.Exception
	{
            Ideone i=new Ideone();
            i.findPass(1234,4567,2445,5677);
	}
}
