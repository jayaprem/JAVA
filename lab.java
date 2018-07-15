Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int k=sc.nextInt();
		String s=s1.toUpperCase();
		String[] a=s.split(" ");
		String b="";
		int cj;
		System.out.println("CYPER TEXT:");
		for(int i=0;i<a.length;i++)
		{
			char[] c=a[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				int c1=k+(int)c[j];
				if(c1<=90)
				{
				b=b+(char)c1;
				System.out.print((char)c1);
				}
				if(c1>90)
				{
				cj=c1-26;
				b=b+(char)cj;
				System.out.println((char)cj);
				}
			}
			b=b+" ";
			System.out.print(" ");
		}
		String[] b1=b.split(" ");
		System.out.println("\nPLAIN TEXT:");
		for(int i=0;i<b1.length;i++)
		{
		char[] c2=b1[i].toCharArray();
			for(int j=0;j<c2.length;j++)
			{
				int c3=(int)c2[j]-k;
				if(c3>=65)
				{
				System.out.print((char)c3);
				}
				if(c3<65)
				{
				cj=c3+26;
				System.out.println((char)cj);
				}
			}
			System.out.print(" ");
		}	

