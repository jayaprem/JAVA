QUESTION:
We will say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string.
The triples may overlap
Eg:
abcXXXabc=1
xxxabyyyycd=3
a=0

import java.util.*;
class A2
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine().toUpperCase();
char c1[]=s1.toCharArray();
int count=0;
for(int i=0;i<c1.length-1;i++)
{
if(c1[i]==c1[i+1])
{
if((i+1)!=c1.length-1)
{
if(c1[i+1]==c1[i+2])
{
count++;
}
}
}
}
System.out.println(count);
}
}


 
