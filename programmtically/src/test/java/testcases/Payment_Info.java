package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Payment_Info {

	
	@Test
	public void apply_discount()
	{
		System.out.println("---apply discount-----");
	}
	@Parameters({"action"})
	@Test
	
	public void makepayment(String paymentType, ITestContext context)
	{   
		if(paymentType.equals("pay@Hotel"))
		System.out.println("--Make Instant Payment complete----");
		
		else
			System.out.println("--Pay@Hotel Booking----");
		
		//Booking number
		String bookingID="ufgkhjkgitgihbk";
		context.setAttribute("bookingID_no",bookingID);
	}
}
