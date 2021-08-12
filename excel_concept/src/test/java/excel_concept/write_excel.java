package excel_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.util.NumericRanges;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class write_excel {
	
	@Test
	public void write() throws IOException
	{
	String path=System.getProperty("user.dir")+"\\details.xlsx";
	File file=new File(path);
	
	FileInputStream input =new FileInputStream(file);
	XSSFWorkbook work= new XSSFWorkbook(input);
	XSSFSheet sheet=work.getSheet("students");
	
	int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumPractice\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	
	WebElement firstName=driver.findElement(By.id("firstName"));
    WebElement lastName=driver.findElement(By.id("lastName"));
    WebElement email=driver.findElement(By.id("userEmail"));
    WebElement genderMale= driver.findElement(By.id("gender-radio-1"));
    WebElement mobile=driver.findElement(By.id("userNumber"));
    WebElement address=driver.findElement(By.id("currentAddress"));
    WebElement submitBtn=driver.findElement(By.xpath("//button[text()='Submit']"));
    
    ///iterate over all the rows in Excel and put data in the form.
    for(int i=1;i<=rowcount;i++) {
        //Enter the values read from Excel 
        firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
        lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
        email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
        
        XSSFCell yourmob =sheet.getRow(i).getCell(4);
        yourmob.setCellType(Cell.CELL_TYPE_NUMERIC);
        String datamob = NumberToTextConverter.toText(yourmob.getNumericCellValue());
        mobile.sendKeys(datamob);
        //String num=NumericRanges.toString(sheet.getRow(i).getCell(4).getNumericCellValue());
       // mobile.sendKeys(num);
        XSSFCell yourCell=sheet.getRow(i).getCell(8);
        yourCell.setCellType(Cell.CELL_TYPE_STRING);
        String data = yourCell.getStringCellValue();
        address.sendKeys(data);
        
        //Click on the gender radio button using javascript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", genderMale);
        js.executeScript("window.scrollBy(0,1000)");
        
        //Click on submit button
        submitBtn.click();
        
        //Verify the confirmation message
        WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
        
        //create a new cell in the row at index 6
        XSSFCell cell = sheet.getRow(i).createCell(11);
        
        //check if confirmation message is displayed
        if (confirmationMessage.isDisplayed()) {
            // if the message is displayed , write PASS in the excel sheet
            cell.setCellValue("PASS");
            
        } else {
            //if the message is not displayed , write FAIL in the excel sheet
            cell.setCellValue("FAIL");
        }
        
        // Write the data back in the Excel file
        String path1=System.getProperty("user.dir")+"\\detail.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path1);
        XSSFWorkbook work1= new XSSFWorkbook();
        work1.write(outputStream);

        //close the confirmation popup
        WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
        closebtn.click();
        
        //wait for page to come back to registration page after close button is clicked
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    
    //Close the workbook
   // work1.close();
    
    //Quit the driver
    //driver.quit();
    
	
	}
}
