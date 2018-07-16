import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={1,2,8,1,2,4,5,3,1,5,5,3,4,5};
		Set s1=new LinkedHashSet();
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count++;	
				}
			}
			if(count>1)
			{
					s1.add(a[i]);
			}
		}
		System.out.println(s1);
		
		
		ArrayList<Integer>  al=new ArrayList<Integer>(s1);
			System.out.println(al.get(0));//first index//1
			System.out.println(al.get(al.size()-1));//last index//3
		
	}
}
