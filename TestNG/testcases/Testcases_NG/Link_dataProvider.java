package Testcases_NG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Link_dataProvider {

	@DataProvider
	public static Object[][] getdata(Method m)
	{
		System.out.println("Method name: "+m.getName());
		Object[][] data=null;
		
		if(m.getName().equals("creatUser"))
		{
			 data= new Object[3][4];
		//row1
		data[0][0]="chrome";
		data[0][1]="Admin";
		data[0][2]=1234;
		data[0][3]="India";
		
		//row2
		data[1][0]="Mozilla";
		data[1][1]="Adminn";
		data[1][2]=12345;
		data[1][3]="Canada";
		
		//row3
		data[2][0]="Edge";
		data[2][1]="Adminnn";
		data[2][2]=123456;
		data[2][3]="Newzland";	
		
		
		}
		else if(m.getName().equals("DeleteUser"))
		{
			 data= new Object[3][4];
		//row1
		data[0][0]="chromeInternet";
		data[0][1]="Admin";
		data[0][2]=1234;
		data[0][3]="India";
		
		//row2
		data[1][0]="Mozilla_Internet";
		data[1][1]="Adminn";
		data[1][2]=12345;
		data[1][3]="Canada";
		
		//row3
		data[2][0]="Edge_Internet";
		data[2][1]="Adminnn";
		data[2][2]=123456;
		data[2][3]="Newzland";	
		
		
		}
		return data;
	}
}
