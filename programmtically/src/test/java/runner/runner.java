package runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class runner {

	public static void main(String[] args) {
		TestNG testing=new TestNG();
		//suite add
		XmlSuite mysuite=new XmlSuite();
		mysuite.setName("Booking Suite");
		List<XmlSuite> allsuites= new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testing.setXmlSuites(allsuites);
		
		//test name
		XmlTest creat_booking=new XmlTest(mysuite);
		creat_booking.setName("Create booking Test-Apply discount-pay@Hotel");
		
		//add parameters
		Map<String,String> parameters= new HashMap<String,String>();
		parameters.put("action","pay@Hotel");
		
		creat_booking.setParameters(parameters);
		
		//add classes
		List<XmlClass> clses= new ArrayList<XmlClass>();
		XmlClass cls= new XmlClass("testcases.booking_search");
		   //methods
		     List<XmlInclude> methods=new ArrayList<XmlInclude>();
		     methods.add(new XmlInclude("searchHotel"));
		     methods.add(new XmlInclude("selectHotel"));
		     methods.add(new XmlInclude("GuestInfo"));
		     cls.setIncludedMethods(methods);
		     clses.add(cls);
		     
		     XmlClass cls_pay= new XmlClass("testcases.Payment_Info");
			   //methods
			     List<XmlInclude> methods_pay=new ArrayList<XmlInclude>();
			     methods_pay.add(new XmlInclude("apply_discount"));
			     methods_pay.add(new XmlInclude("makepayment"));
			     cls_pay.setIncludedMethods(methods_pay);
			     clses.add(cls_pay);
			     
			     XmlClass cls_comm= new XmlClass("testcases.coustmer_comm");
				 clses.add(cls_comm);
				     
				 creat_booking.setXmlClasses(clses);
			
	   //XmlClass cls_comm= new XmlClass("testcases.Payment_Info");
		
				     testing.run();
		
		 //clses.add(new XmlClass("testcases.Payment_Info"));
		
		
		//cls.add(new XmlClass("testcases.coustmer_comm"));
		
		

	}

}
