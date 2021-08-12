package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testcases_NG.Link_dataProvider;


public class Data_Provider {

	@Test(dataProviderClass=Link_dataProvider.class,dataProvider="getdata")
	public void creatUser(String browser,String UserType, int contact, String Country)
	{
		System.out.println("Browser Name="+browser+ "\nUser Name="+UserType+ "\nMobile No.="+contact+"\nEmail ID="+Country+ "\n");
	}
	@Test(dataProviderClass=Link_dataProvider.class,dataProvider="getdata")
	public void DeleteUser(String browser,String UserType, int contact, String Country)
	{
		System.out.println("Browser Name="+browser+ "\nUser Name="+UserType+ "\nMobile No.="+contact+"\nEmail ID="+Country+ "\n");
	}
	
	/*@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[3][4];
		
		//row1
		data[0][0]="chrome";
		data[0][1]="Admin"
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
		
		return data;
	}*/
}
