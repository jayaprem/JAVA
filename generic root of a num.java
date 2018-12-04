GENERIC ROOT:
SUM OF DIGITS OF A NUMBER UNTIL WE GET A SINGLE DIGIT
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=0,sum=0;
    while(n>10)
    {
    	sum=0;
    while(n>0)
    {
    	a=n%10;
    	sum=sum+a;
    	n=n/10;
    }
    n=sum;
    }
    System.out.println(n);
}
}
ANOTHER WAY USING conditional operator
int root=(n%9!=0)?n%9:9;
System.out.println(root);
