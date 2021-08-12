package Testcases_NG;

import org.testng.annotations.Test;

import test_provider.link_data_provider;



public class Data_Provider_createuser {

	@Test(dataProviderClass=link_data_provider.class,dataProvider="getData")
	
	public void CreatUser(String browser,String UserType, int contact, String email)
	{
		
		System.out.println("Browser Name="+browser+ "\nUser Name="+UserType+ "\nMobile No.="+contact+"\nEmail ID="+email+ "\n");
		
		
		
	}
	@Test(dataProviderClass=link_data_provider.class,dataProvider="getData")
	public void DeleteUser(String browser,String UserType, int contact, String email)
	{
		System.out.println("Browser Name="+browser+ "\nUser Name="+UserType+ "\nMobile No.="+contact+"\nEmail ID="+email+ "\n");
		
		
		
	}
	

/*@DataProvider
public Object[][] getData(Method m)
{
	Object[][] data=null;
	System.out.println("Method/Test" +m.getName());
	
	if(m.getName().equals("CreatUser"))
	{
	data=new Object[3][4];
	
	data[0][0]="chrome";
	data[0][1]="Admin";
	data[0][2]=345;
	data[0][3]="abc@gmail.com";
	
	data[1][0]="Explore";
	data[1][1]="super";
	data[1][2]=3456;
	data[1][3]="abcd@gmail.com";
	
	data[2][0]="Mozilla";
	data[2][1]="duper";
	data[2][2]=34567;
	data[2][3]="abcde@gmail.com";
	

	}
	else if(m.getName().equals("DeleteUser"))
	{
		//Object[][] data1=new Object[3][4];
		
		data[0][0]="chrome";
		data[0][1]="Admin";
		data[0][2]=345;
		data[0][3]="abc@gmail.com";
		
		data[1][0]="Explore";
		data[1][1]="super";
		data[1][2]=3456;
		data[1][3]="abcd@gmail.com";
		
		data[2][0]="Mozilla";
		data[2][1]="duper";
		data[2][2]=34567;
		data[2][3]="abcde@gmail.com";
		
		
	}
	return data;
	
	
}*/
}
