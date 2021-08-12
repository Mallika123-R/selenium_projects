package runner;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class customTestRunner {

	

	public static void main(String[] args) {
	
		
		custom_runner runner=new custom_runner(1);
         runner.createSuite("Booking Suite");
		runner.addTest("Create booking Test-Apply discount-pay@Hotel");
		
		runner.run();
		/*runner.setparam("action", "pay@Hotel");
	  
	  List<String> methodnames=new ArrayList<String>();
	  methodnames.add("searchHotel");
	  methodnames.add("selectHotel");
	  methodnames.add("GuestInfo");
	  runner.addTestclass("testcases.booking_search",methodnames);
	  
	 /*methodnames=new ArrayList<String>();
	  methodnames.add("apply_discount");
	  methodnames.add("makepayment");
	  runner.addTestclass("testcases.Payment_Info",methodnames);
	  
	//methodnames=new ArrayList<String>();
	  methodnames_pay.add("apply_discount");
	  //methodnames_pay.add("makepayment");
		
	 // runner.addTestclass("testcases.coustmer_comm",methodnames);*/
	  
	  
	  
	  
	  
	
	
	}
	
		
}
