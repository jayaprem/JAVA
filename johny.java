import java.io.*;
import java.util.*;
class string
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,j;
String i1=sc.next();
String i2=sc.next();
String i3=sc.next();
String[] a={i1,i2,i3};
ArrayList front=new ArrayList();
ArrayList mid=new ArrayList();
ArrayList end=new ArrayList();
for(i=0;i<a.length;i++)
{
String s=a[i];
int len=s.length();
if(len%3==1)
{
front.add(s.substring(0,len/3));
mid.add(s.substring(len/3,(((len/3)*2)+1)));
end.add(s.substring((((len/3)*2)+1),len));
}
if(len%3==2)
{
front.add(s.substring(0,(len/3)+1));
mid.add(s.substring((len/3)+1,(len/2)+1));
end.add(s.substring((len/2)+1,len));
}
if(len%3==0)
{
front.add(s.substring(0,len/3));
mid.add(s.substring(len/3,(len/3)*2));
end.add(s.substring(((len/3)*2),len));
}
}
System.out.println(front);
System.out.println(mid);
System.out.println(end);
ArrayList<String> aj=new ArrayList<String>();
aj.add(front.get(0)+""+mid.get(1)+""+end.get(2));
aj.add(mid.get(0)+""+end.get(1)+""+front.get(2));
aj.add(end.get(0)+""+front.get(1)+""+mid.get(2));
//System.out.println(aj.get(0));
for(j=0;j<aj.size();j++)
{
String d="";
char[] c=aj.get(j).toCharArray();
for(i=0;i<c.length;i++)
{
if(Character.isLowerCase(c[i]))
{
d=d+Character.toUpperCase(c[i]);
}
if(Character.isUpperCase(c[i]))
{
d=d+Character.toLowerCase(c[i]);
}
}
System.out.println(d);
}
}
}
QUESTION:

             kars was assigned the task of comingup an encoding mechanism for any given 3 strings.she was comingup with following plan
given any 3 strings break each string into three parts.
STEP 1: 
      If no of char in the string are  in the multiple of 3.each split will contain equal of characters are seen in 

janardhan
      If no of char in the string are not in the multiple of 3 and if there is one char more than the multiple of 3 then 

middle part will get the xtra char as in input 1.
      If no of char in the string are not in the multiple of 3 and if there are 2 char more than multiple of 3 then front 

and end part will get one char xtra each as in input 2.
STEP 2:
    concatenate front,middle,end part of string as per the below specified concatenation rule to form three output strings
       OUTPUT1:  front part of ip1 and middle part of ip2 and end part of ip3.
       OUTPUT2:  middle part of ip1 and end part of ip2 and front part of ip3.
       OUTPUT3:  end part of ip1 and front part of ip2 and middle part of ip3.
STEP3:
    apply the toggle rule(lowercase to uppercase and vice-versa) in each output.

    INPUT1:John
    INPUT2:Johny
    INPUT3:Janardhan

STEP1 OUTPUT:
    "J" "oh" "n" 
    "Jo" "h" "ny"
    "Jan" "ard" "han"
STEP2 OUTPUT:
    Jhhan
    ohnyJan
    nJoard
STEP3 OUTPUT:
     jHHAN
     OHNYjAN
     NjOARD
    
