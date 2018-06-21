int accno,,dateopen,branchcode,accbalance;
String acctype,accholder;
int count=0;
int month=1;
bank(int ano,String atype,String aholder,int dateopen,int bcode,int balance)
{
accno=ano;
acctype=atype;
accholder=aholder;
dateopen=dateopen;
branchcode=bcode;
accbalance=balance;
}
public void deposit(int amt)
{
accbalance=accbalance+amt;
Sytem.out.println("deposited amt is"+amt);
Sytem.out.println("accoun balance is"+accbalance);
count=count+1;
}
public void withdraw(int amt)
{
accbalance=accbalance-amt;
Sytem.out.println("deposited amt is"+amt);
Sytem.out.println("accoun balance is"+accbalance);
count=count+1;
}
if(count>3 && month<31)
{
accbalance=accbalance-50;
System.out.println("fine amt 50 is deducted from your account your current balance is"+accbalance);
}
if(acctype=="saving")
{
System.out.println("your limit per day is 50000");
if(amt>50000)
{
accbalance=accbalance-100;
System.out.println(accbalance);
System.out.println("fine amt "100 deducted from your account and your cuurent balace"+accbalace);.
}
}
else
{

System.out.println("your limit per day is 50000");
if(amt>100000)
{
accbalance=accbalance-100;
System.out.println(accbalance);
System.out.println("fine amt "100 deducted from your account and your cuurent balace"+accbalace);.
}
}
