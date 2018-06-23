import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{

		public static int output1;
	public static int a=0;
	public static int b=1;
	    public static int count=1;
		
    public static void nthFibonacci(int input1){
    	if(input1==0)
    	{
    		output1=0;
    		System.out.println(output1);
    	}
    	else if(input1==1)
    	{
    		output1=1;
    		System.out.println(output1);
    	}
    	else
    	{
		for(int i=2;i<=input1;i++)
		{
		output1=a+b;
                a=b;
		b=output1;
		count++;
			if(count==input1)
			{
				System.out.println(output1);
			}
		}
    	}
    }
				public static void main (String[] args) throws java.lang.Exception
	{
		Ideone i=new Ideone();
		i.nthFibonacci(5);

	}
}
