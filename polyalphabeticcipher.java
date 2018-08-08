import java.io.*;
import java.util.*;
import java.lang.*;
class polyalphabetic
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a plain text");
String s=sc.nextLine().toUpperCase();
System.out.println("enter a key");
String k=sc.next().toUpperCase();
int i,c=0,j=0,t=0;
char a[]=new char[s.length()];
for(i=0;i<s.length();i++)
{
if(j==k.length())
{
j=0;
}
a[i]=k.charAt(j);
j++;
}
System.out.println("ENCRYPTION:");
for(i=0;i<s.length();i++)
{
c=(s.charAt(i)+a[i])%26;
c+='A';
System.out.print((char)c);
}
System.out.println();
System.out.println("enter a cipher text");
String d=sc.next().toUpperCase();
System.out.println("enter a key");
String k1=sc.next().toUpperCase();
char g[]=new char[d.length()];
for(i=0;i<d.length();i++)
{
if(t==k1.length())
{
t=0;
}
g[i]=k1.charAt(t);
t++;
}
System.out.println("DECRYPTION:");
for(i=0;i<d.length();i++)
{
int x=(d.charAt(i)-g[i]+26)%26;
x+='A';
System.out.print((char)x);
}
}
}
output:
enter a plain text
jayalakshmi
enter a key
nevergiveup
ENCRYPTION:
WETECGSNLGX
enter a cipher text
wetecgsnlgx
enter a key
nevegiveup
DECRYPTION:
JAYALAKSHMI
