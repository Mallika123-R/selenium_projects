package pilot_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_calander {
	
	public static void main(String[] args)  {
     Date d =new Date();
    System.out.println(d.toString());
    String select_date="01-03-2021";
    
    SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
    Date dateToBeSelected;
	try {
		dateToBeSelected = sd.parse(select_date);
		System.out.println(dateToBeSelected.toString());
		
		//compare dates
		System.out.println(d.compareTo(dateToBeSelected));
		
		//extract day
		String day=new SimpleDateFormat("dd").format(dateToBeSelected);
		System.out.println("select date\t" + day);
		
		//extract month
		String month=new SimpleDateFormat("MM").format(dateToBeSelected);
		System.out.println("Select month\t" + month);
		
		//extract year
		String Year=new SimpleDateFormat("yyyy").format(dateToBeSelected);
		System.out.println("Select year\t" + Year);
	} 
	
	
	
	catch (ParseException e) {
		
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
    
     }
}
