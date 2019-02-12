public class Innings {
	String BattingTeam;
	long Runs;
	public Innings(String battingTeam, long runs) {
		super();
		BattingTeam = battingTeam;
		Runs = runs;
	}
	
	public String getBattingTeam() {
		return BattingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		BattingTeam = battingTeam;
	}
	public long getRuns() {
		return Runs;
	}
	public void setRuns(long runs) {
		Runs = runs;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-20l",BattingTeam,Runs); 

	}
	}
  
public class InningsBO {
	public static void DisplayAllInningsDetails(Innings[] inningsList)
	{
		System.out.println("Innings Details");
		for(int i=0;i<inningsList.length;i++)
		{
			System.out.println(inningsList[i]);
		}
	}

}
import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innings[] i1=new Innings[2];
		String[] a={"First","Second"};
        Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++)
{
	System.out.println("Enter the values for "+a[i]+"Innings");
	System.out.println("Enter the BattingTeam ");
	String s=sc.nextLine();
	//sc.nextLine();
	System.out.println("Enter the runs scored");
	long l=sc.nextLong();
	i1[i]=new Innings(s,l);
}
InningsBO.DisplayAllInningsDetails(i1);
	

	}
}

