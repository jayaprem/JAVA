Question:
"A number is stable if each digit occur the same number of times i.e,frequency of each digit in the number is the same."
find the stable numbers
sum the value of max and min stable number

import java.io.*;
import java.util.*;
import java.lang.*;
class stable
{
public static void main(String[] args)
{
String s[]={"12","1313","122","678","898"};
int i=0,t=0;
ArrayList<Integer> ts=new ArrayList<Integer>();
ArrayList al=new ArrayList();
for(i=0;i<s.length;i++)
{
t=0;
for(int j=0;j<s[i].length();j++)
{
al.add(s[i].charAt(j));
}
for(int k=0;k<al.size();k++)
{
t=t+Collections.frequency(al,al.get(k));
}
if(t%2==0||t==s[i].length())
{
ts.add(Integer.valueOf(s[i]));
}
al.clear();
}
Collections.sort(ts);
System.out.println("stable numbers:"+ts);
System.out.println("maximum of all stable numbers:"+ts.get(ts.size()-1));
System.out.println("minimum of all stable numbers:"+ts.get(0));
System.out.print("SUM:");
System.out.print(ts.get(0)+ts.get(ts.size()-1));
}
}
output:
stable numbers:[12,678,1313]
maximum of all stable numbers:1313
minimum of all stable numbers:12
SUM:1325
