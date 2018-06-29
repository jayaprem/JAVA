import java.io.*;
import java.lang.*;
import java.util.*;

 class Today {
int q=0;
	public void div(int dv,int dr)
	{
		while(dv>=dr)
		{
			dv=dv-dr;
			q++;
		}
	
		if(dv==0)
		{
			System.out.println("divisible"+q);
		}
		else
		{
			System.out.println("not divisible");
		}
	}

	public static void main(String[] args) {
		Today t=new Today();
		t.div(1998,999);

	}

}
You are given an n-digit large number, you have to check whether it is divisible by 999 without dividing or finding modulo of number by 999.
Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an string denoting the number.

Output:
Print "Divisible" (without quotes) if the number is divisible by 999.
Print "Not divisible" (without quotes) if the number is not divisible by 999.

Example: Input: 2
1998
999999999

Output: 
Divisible
Not divisible

