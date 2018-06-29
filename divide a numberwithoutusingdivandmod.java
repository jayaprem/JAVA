import java.io.*;
import java.lang.*;
import java.util.*;

 class Today {

	public void div(int dv,int dr)
	{
		while(dv>=dr)
		{
			dv=dv-dr;			
		}
	
		if(dv==0)
		{
			System.out.println("divide");
		}
		else
		{
			System.out.println("not divide");
		}
	}

	public static void main(String[] args) {
		Today t=new Today();
		t.div(10,3);

	}

}
