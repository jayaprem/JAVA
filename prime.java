ArrayList<Integer> x=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int a=99;
int ans;
for(int i=11;i<=99;i++)
{
int count=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
count=1;
}
}
if(count==0)
{
x.add(i);
}
}
for(int k=0;k<=x.size();k++)
{
for(int j=1;i<=x.size();j++)
{
ans=x[i]+x[j];
if(ans==b)
{
System.out.println(ans);
}
else 
{
ans=ans+x[j];
System.out.println(ans);
}
}
}
