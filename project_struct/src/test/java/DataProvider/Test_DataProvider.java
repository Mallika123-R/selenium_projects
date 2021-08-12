package DataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class Test_DataProvider {

	
	
	@DataProvider
	public static Object[][] dataSuitA(ITestContext con,Method m)
	{
	 System.out.println(m.getName());
	 String browsers[]=con.getCurrentXmlTest().getParameter("browsers").split(",");
	 Object data[][]=null;
	 
	 if(m.getName().toUpperCase().equals("TESTA"))
	 {
		 
		 data=new Object[2][3];
		 //row1
		 data[0][0]=browsers[0];
		 data[0][1]="userName";
		 data[0][2]="password";
		 
		 //row2
		 data[1][0]=browsers[1];
		 data[1][1]="Mallika";
		 data[1][2]="Milly123";
		 
	 }
	
	 
	 /*else if(m.getName().toUpperCase().equals("TESTAA"))
	 {
		//row1
		 data[0][0]="uname";
		 data[0][1]="pass";
		 
		 //row2
		 data[1][0]="Rahil";
		 data[1][1]="Golgpu";
	 }*/
	 else if(m.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][3];
			// row 1
			 data[0][0]=browsers[0];
			data[0][1]="Uname";
			data[0][2]="Pass";
			// row 2
			 data[1][0]=browsers[1];
			data[1][1]="U2";
			data[1][2]="P2";
		}
	 
	 return data;
	}
	
	
	@DataProvider
	public Object[][] dataSuitB(ITestContext con,Method m)
	{
		System.out.println(m.getName());
		String browsers[]=con.getCurrentXmlTest().getParameter("browsers").split(",");
		 Object data[][]=null;
		 
		 if(m.getName().toUpperCase().equals("TESTB"))
		 {
			 data=new Object[2][3];
			 //row1
			 data[0][0]=browsers[0];
			 data[0][1]="userName_B";
			 data[0][2]="password_B";
			 
			 //row2
			 data[0][0]=browsers[1];
			 data[1][1]="Mallika_B";
			 data[1][2]="Milly123_B";
			 
		 }
		 
		 return data;
		}
	}

