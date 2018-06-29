import java.io.*;
import java.lang.*;
import java.util.*;

 class Today {
int q=0;
	public void div(int dv,int dr)
	{
		while(dv>=dr)
		{
			dv=dv-dr;
			q++;
		}
	
		if(dv==0)
		{
			System.out.println("divisible"+q);
		}
		else
		{
			System.out.println("not divisible");
		}
	}

	public static void main(String[] args) {
		Today t=new Today();
		t.div(1998,999);

	}

}
