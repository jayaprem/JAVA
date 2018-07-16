import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int t=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=t;k++)
			{
				System.out.print(count);
			}
			count=count+1;
			t=t+2;
			System.out.print("\n");
		}
	}
}
    1
   222
  33333
 4444444
555555555
