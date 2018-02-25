import java.util.*;
import java.lang.*;
import java.io.*;

class Leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%4==0)
	System.out.println("leap year");
	else
	System.out.println("Not a leap year");
	}
}
