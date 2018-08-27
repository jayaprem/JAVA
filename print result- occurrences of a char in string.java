  QUESTION:
 Input1="jaya"
Input2=100-999
convert the input into mod26 format.
find the character based on the result.
check whether the character appear in a string or not
If the char in a string,find the number of occurrences of char
if it is more than 1 ,print not stable
else if print stable
else print 0 i.e, (the char doesnt appear in the string )

import java.io.*;
import java.util.*;
class A1
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine().toUpperCase();
//System.out.println(s1);
int n1=sc.nextInt();
if(n1>99&&n1<1000)
{
int x=n1%26;
int d='A'+x;
char c=(char)d;
System.out.println("the char generated is:"+c);
char[] c1=s1.toCharArray();
ArrayList<Character> al=new ArrayList<Character>();
for(char b:c1)
{
al.add(b);
}
int v=Collections.frequency(al,c);
if(v==1)
System.out.println("STABLE");
else if(v>1)
System.out.println("UNSTABLE");
else
System.out.println("default");
}
else
{
System.out.println("enter a valid input");
}
}
}
OUTPUT:
the char generated is:A
UNSTABLE
