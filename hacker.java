#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int sort(int,int[],int);
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int s,n,i,j,k,t;
    scanf("%d %d",&s,&n);
    int a[s],c[s];
    for(i=0;i<10;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<s;i++)
    {
        c[i]=sort(s,n,a);
        printf("%d",c[i]);
    }
    return 0;
}
int(int s,int n,int a[s])
{
    int t=0;
    for(j=0;j<10;j++)
    {
        for(k=j+1;k<10;k++)
        {
        if(a[j]>a[k])
        {
         t=a[j];
         a[j]=a[k];
        a[k]=t;
        }
        }
    }
    for(i=0;i<n;i++)
    {
    a[t]=a[i];  
        t++;
    }
    for(j=s-1;j>=n;j--)
    {
    a[t]=a[j]; 
        t++;
    }

    return a;
}
