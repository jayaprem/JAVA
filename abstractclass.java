
import java.util.*;
import java.lang.*;
import java.io.*;
abstract class Psna
{
	abstract void cse();
	public void show()
	{
		System.out.println("hi");
	}
}
class cse extends psna
{
	void cse()
	{
		System.out.println("welcome");
	}

	public static void main (String[] args) throws java.lang.Exception
	{
	cse c1=new cse();
	c1.cse();
	c1.show();
	}
}
