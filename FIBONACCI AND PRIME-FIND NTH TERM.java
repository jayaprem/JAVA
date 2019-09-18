QUESTION:
consider the below series:
1,2,1,3,2,5,3,7,5,11,8,13,13,17................
this series is a mixture of 2 series all the odd terms in this series form a fibonacci series and all the even terms are the prime numbers in ascending order
Write a program to find the Nth term in this series
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,a=0,b=1,c=0,count;
    System.out.println("enter a N value");
    Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int t=2;
		int[] d=new int[N+1];
		for(i=1;i<=N;i++)
		{
			if(i%2!=0)
			{
				if(i==1)
				{
					d[i]=1;
					
				}
			            else
			            {	
			            d[i]=a+b;
			            a=b;
			            b=d[i];
			            }
				}
		}
		i=2;
	  while(t<=N)
		{   
			count=0;
			 for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			 if(count==2)
	                {
				d[t]=i;
				t=t+2;
		        }
		        i=i+1;
		}
	System.out.println("Ans:"+d[N]);
	}
}

OUTPUT:
Enter a N value:
14
Ans:17
