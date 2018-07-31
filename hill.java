import java.util.*;
import java.lang.*;
import java.io.*;
class m
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char[] A={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println("ENCRYPTION:");
		System.out.println("enter the rows and columns of 1st matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int i,j,sum=0,d,s=0;
		int[][] a=new int[r1][c1];  
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the rows and columns of key matrix");
		Scanner sc1=new Scanner(System.in);
		int r2=sc1.nextInt();
		int c2=sc1.nextInt();
		int[][] b=new int[r2][c2];
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
			b[i][j]=sc.nextInt();
			}
		}
		System.out.println("cipher text");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(int k=0;k<r2;k++)
				{
				sum=sum+a[i][k]*b[k][j];
				}
								System.out.print(A[sum%26]);
        sum=0;
			}
		}
		System.out.println("DECRYPTION:\n");
		System.out.println("enter the row and coln of inverse matrix");
		int p1=sc.nextInt();
		int s1=sc.nextInt();
				int[][] c=new int[p1][s1];
		for(i=0;i<p1;i++)
		{
		for(j=0;j<s1;j++)
		{
		c[i][j]=sc.nextInt();
		}
		}
		System.out.println("enter the row and coln of key matrix");
		int p2=sc.nextInt();
		int s2=sc.nextInt();
		int[][] b1=new int[p2][s2];
		for(i=0;i<p2;i++)
		{
			for(j=0;j<s2;j++)
			{
			b1[i][j]=sc.nextInt();
			}
		}
				System.out.println("plain text");
		for(i=0;i<p1;i++)
		{
			for(j=0;j<s2;j++)
			{
				for(int k=0;k<p2;k++)
				{
				s=s+c[i][k]*b1[k][j];
				}
								System.out.print(A[s%26]);
        s=0;
			}
		}
	}
}
			v
