import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();

    Calendar cal = new GregorianCalendar(Integer.parseInt(year),(Integer.parseInt(month)-1),(Integer.parseInt(day)-1));
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

    String days[]={"", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY","SUNDAY"};

    System.out.println(dayOfWeek);
	}
}
