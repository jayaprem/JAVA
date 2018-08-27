QUESTION:
Remove a string from a sentence:
("hello there","llo")="he there"
("hello there","e")="hllo thr"
("hello there","x")="hello there"
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("String:\n"+s);
		String s1=sc.next();
		System.out.println("The string to be deleted is:\n"+s1);
		s=s.replaceAll(s1,"");
		System.out.println("The String after deletion:\n"+s);
	}
}
OUTPUT:
String:
hello there
The string to be deleted is:
e
The String after deletion:
hllo thr

