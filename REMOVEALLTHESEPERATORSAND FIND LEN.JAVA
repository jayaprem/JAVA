import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
String s="abc\t\ndef   ghi";
String s1="one   two   three  \t  four";
String[] w = s.split("\\W+");
String[] w1 = s1.split("\\W+");
System.out.println(w.length);
System.out.println(w1.length);
}
}
. Given a string consisting of spaces,\t,\n and lower case  alphabets.Your task is to count the number of words where spaces,\t and \n work as separators.

Input:
The first line of input contains an integer T denoting the number of test cases.Each test case consist of a string.

Output:
Print the number of words present in the string.

Example:
Input: 2
abc\t\ndef   ghi
one   two   three  \t  four
Output:
3
4

