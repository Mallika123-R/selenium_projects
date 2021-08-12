package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class coustmer_comm {

	@Test
	public void check_mail(ITestContext context)
	{
		System.out.println("check mailing for confirmation");
		String bookingid=(String)context.getAttribute("bookingID_no");
		System.out.println("checking mail for booking ID\t :" +bookingid);
	}
}
