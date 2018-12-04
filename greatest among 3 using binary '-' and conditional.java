/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a-b>0 && a-c>0)
         System.out.println("Greatest is a"+a);
    else if(b-c>0)
              System.out.println("Greatest is b"+b);
         else
             System.out.println("Greatest is c"+c);
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int large=(a>b&&a>c?a:b>c?b:c);
System.out.println(large);
}
}
