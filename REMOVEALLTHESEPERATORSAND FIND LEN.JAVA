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
