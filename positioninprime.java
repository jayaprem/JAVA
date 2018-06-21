import java.io.*;
import  java.util.*;

class UserMainCode
{

    public static int output1;
	public static int a=0;
	public static int b=1;
	    public static int count=1;
		
    public static void nthFibonacci(int input1){
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
