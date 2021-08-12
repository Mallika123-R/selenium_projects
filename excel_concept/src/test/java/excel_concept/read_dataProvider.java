package excel_concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class read_dataProvider {

	public WebDriver driver;
	public WebDriverWait wait;
	String appURL="https://www.linkedin.com";
	String excelPath=System.getProperty("user.dir")+"//cradential.xlsx";
	String sheetName="credential";
	
	
	@Test(dataProvider="empLogin")
	public void invalidLogin(String userName, String password)
	{
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.findElement(By.id("session_key")).sendKeys("userName");
		driver.findElement(By.id("session_password")).sendKeys("password");
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='sign-in-form__submit-button']")));
		driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='alert-content']")));
		//String actualErrormsg=driver.findElement(By.xpath("//p[@class='alert-content']")).getText();
		//String ExpectedErrormsg="";
	}
	
	@DataProvider(name="empLogin")
	public Object[][] loginData() throws IOException
	{
		Object[][] data=getExceldata(excelPath, sheetName);
		
		return data;
	}
	public Object[][] getExceldata(String excelPath, String sheetName) throws IOException
	{
		Object[][] exceldata=null;
		
		FileInputStream fs=new FileInputStream(excelPath);
		XSSFWorkbook work=new XSSFWorkbook(fs);
		XSSFSheet sheet=work.getSheet(sheetName);
		
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		XSSFRow row = sheet.getRow(0);
		int columncount=row.getLastCellNum();
		exceldata= new Object[rowcount][columncount];
		
		for(int i=1; i<rowcount; i++)
		{
			row=sheet.getRow(i);
		
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				exceldata[i-1][j] = sheet.getCellComment(j, i);
				System.out.println(row.getCell(j).getStringCellValue()+"||");
			}
		}
		return exceldata;
		
	}
}
