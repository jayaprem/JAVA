import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        
                    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int i,j,c=0,t=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            lh.add(a[i]);
        }
        al.addAll(lh);
       for(i=0;i<al.size();i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
            if(al.get(i)==a[j])
            {
                c++;
            }
            }
                t=t+(c/2);
        }
        System.out.println(t);
            }
}
QUESTION:
9
10 20 10 10 10 30  20 50 20
OUTPUT:3(NUMBER OF PAIRS eg:
4 10's=2 pair
3 20's=1 pair
others are single)

ANOTHER SOLUTION:
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,c=0,t=0;
		int[] a=new int[n];
		int[] b=new int[n];
		
		for(i=0;i<n;i++)
		{
			b[i]=a[i]=sc.nextInt();
		
		}
		for(i=0;i<n;i++)
		{c=0;
			for(j=0;j<n;j++)
		  {
				if(a[i]==b[j])
			{
				c++;
				b[j]=-1;
			}
		  }
			t=t+(c/2);
		}
	  System.out.println(t);
	}
}
