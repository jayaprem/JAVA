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
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<count;k++)
			{
				System.out.print("*");
			}
			count=count+2;
			System.out.print("\n");
		}
	}
}
output:
    *
   ***
  *****
 *******
*********

