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
					int large=0;
			while(x[i]>0)
			{
			 a=x[i]%10;
			/* if(a>=large)
		            {
			large=a;
			k[i]=large;
			
                                    }*/
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
			for(int i=0;i<4;i++)
			{
				System.out.println(p[i]);
			}
			for(int i=0;i<4;i++)
			{
				int l=0;
				if(p[i]>=l)
				{
					p[i]=l;
				}
			}
			
			}
	public static void main (String[] args) throws java.lang.Exception
	{
            Ideone i=new Ideone();
            i.findPass(1234,4567,2445,5677);
	}
}
