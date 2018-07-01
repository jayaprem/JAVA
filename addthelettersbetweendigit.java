import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String  s1= sc.nextLine();
		String str="";
		int sum=0,c1=0;
		for(int i=0;i<s1.length();i++){
			char c =s1.charAt(i);
			if(Character.isDigit(c)){
				str=str+c;
				c1++;
			}
			else if(Character.isLetter(c))
			{
				if(c1>0){
					sum=sum+Integer.valueOf(str);
				c1=0;	
				str="0";
				}
			}
		}
		sum+=Integer.parseInt(str);
		System.out.println(sum);
		

	}
}
Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.
Input: The first line of input contains an integer T denoting the number of test cases. Then T test cases
follow. Each test case contains a string containing alphanumeric characters.
Output: Print the sum of all numbers present in the string.

Example:
Input: 4
1abc23
psna4cse
1abc2x30yz67
123abc

Output:
24
4
100
123
