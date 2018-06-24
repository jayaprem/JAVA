import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
int accno,dateopen,branchcode,accbalance;
String acctype,accholder;
int count=0;
int month=1;
Ideone(int ano,String atype,String aholder,int balance)
{
accno=ano;
acctype=atype;
accholder=aholder;
/*dateopen=dateopen;
branchcode=bcode;*/
accbalance=balance;
}
public void deposit(int amt)
{
accbalance=accbalance+amt;
System.out.println("deposited amt is"+amt);
System.out.println("accoun balance is"+accbalance);
count=count+1;
}
public void withdraw(int amt)
{
if(acctype=="saving")
{

if(amt>50000)
{
	System.out.println("your limit per day is 50000");
accbalance=accbalance-100;
accbalance=accbalance-amt;
System.out.println("fine amt 100 deducted from your account becoz you withdraw"+amt);
System.out.println("current balance"+accbalance);
}
else
{
accbalance=accbalance-amt;
System.out.println("withdrawn amount is"+amt);
System.out.println("account balance"+accbalance);	
}
}
else 
{

if(amt>100000)
{
	System.out.println("your limit per day is 100000");
accbalance=accbalance-100;
accbalance=accbalance-amt;
System.out.println("fine amt 100 deducted from your account becoz you withdraw"+amt);
System.out.println("current balance"+accbalance);
}
else
{
	accbalance=accbalance-amt;
	System.out.println("withdrawn amount is"+amt);
System.out.println("acc balance"+accbalance);
}
}
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone i=new Ideone(1,"current","jaya",200000);
		i.withdraw(50000);
	}
}
	
