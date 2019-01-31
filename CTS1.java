QUESTION:
Write a program to read a string and find whether it is a valid string or not. 
Validation Rules : 

1. It accepts the team name as a string and is appended with the team's location and team's captain name. 
2.A special character '@' is introduced between the team name and team's location 
3.A special character '*' is introduced at the beginning and end of the team's captain name 
4.Team name,lteam location and Captain name should start with upper case letters 

Include a class UserMainCode with a static method validateTeam  which accepts a string. In this method check whether the given team name is valid as per the validation rules mentioned above. The return type is Boolean. 

  
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode. 

Input and Output Format: 
Input consists of a string. 
Output consists of a string “Valid” or “Invalid”. 
Refer sample output for formatting specifications. 

Sample Input 1: 
Bengal-Warriors@Kolkata*Nilesh Shinde* 
Sample Output 1: 
Valid 

Sample Input 2: 
Bengaluru-Bulls@Bengaluru*Manjit Chillar@ 
Sample Output 2: 
Invalid 


import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,c=0,t=0;
    for(i=0;i<s.length();i++)
	{
		if((s.charAt(i)=='@')) t++;
        if((s.charAt(i)=='*')) c++;
	}
	if((s.indexOf("@"))<(s.indexOf("*")))
	{
        if((t==1)&&(c==2))
        {
        System.out.print("Valid");
        }
        else 
        System.out.print("Invalid");
     }
    }
}
