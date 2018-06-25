import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int x=0,count=0;
		while(a>0)
		{
		int c=a%10;
		if(count%2!=0)
		{
			x=x+(c*c*c);
			
		}
		a=a/10;
		count++;
	
		}
		System.out.println(x);
		
	}
}
