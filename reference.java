if(i2==1)
                         {
                         	
		            for(int i=0;i<a.length;i++)
			{
			al.add(new StringBuilder(a[i]).reverse().toString());
                                     }
                                     String s=String.join(" ",al);
                                     StringBuilder sb=new StringBuilder();
                                     StringBuilder str=sb.append(s);
                                     StringBuilder sb1=new StringBuilder();
                                     StringBuilder str1=sb1.append(i1);
                                     int count=0;
                                     for(int i=0;i<s.length();i++)
                                     {count++;
                                     if(count==1||count==7||count==11||count==20||count==25){
                                      str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
                                      str1.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
                                     }
                                     }
                                      System.out.println(str);
                                      System.out.println(str1);
