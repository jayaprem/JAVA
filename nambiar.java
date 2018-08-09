QUES:
mechanism to process any given mobile no and thus generate new resultant no.the mechanism is as follows:
In the given mobile number starting with the 1st digit keep on adding the subsequent digit till the state (even or odd of the sum of the digit) is opposite to the state(odd or evenof the 1st digit).
continue this from the subsequent digit till the last digit of the mobile number is reached.
concatenating the sum

EXAMPLE:
9880127431
9-odd=>9+8+8+0+1=26(even digit)
2-even=>2+7=9(odd)
4-even=>4+3=7(odd)
remaining =>1
output:
26971(concate)

import java.util.*;
import java.lang.*;
import java.io.*;
class N
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//int[] a={9,8,8,0,1,2,7,4,3,1};
		String k="9880127431";
		int i=0,sum=0,j;
		String s=" ";
		int[] a=new int[k.length()];
		for(j=0;j<k.length();j++)
		{
		a[j]=Integer.parseInt(Character.toString(k.charAt(j)));
		}
		while(i<a.length)
		{
			
			if(a[i]%2!=0)
			{
				do
				{
				sum=sum+a[i];
				i++;
				}while(sum%2!=0);
				s=s+sum;
				sum=0;
			}
			else if(a[i]%2==0)
			{
				do
				{
					sum=sum+a[i];
					i++;
				}while(sum%2==0);
				s=s+sum;
				sum=0;
			}
			  if(i==a.length-1)
				{
				s=s+a[i];
	                                   break;
				}
			}
		System.out.println(s);
	}
}
