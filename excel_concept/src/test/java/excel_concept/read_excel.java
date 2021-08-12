package excel_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class read_excel {
	
	@Test
	public void read_data() throws IOException
	{
		//creat an obj of the file class to open xls file
		String path=System.getProperty("user.dir")+"\\excel_sheet.xlsx";
		File file=new File(path);
		//read excel file
		FileInputStream input=new FileInputStream(file);
		
		/*
		String extension_Name=path.substring(path.indexOf("."));
		  XSSFWorkbook excel_work=null;
		 HSSFWorkbook excel_work1 = null;
		if(extension_Name.equals(".xlsx"))
		{
			excel_work=new XSSFWorkbook(input);
		}
		if(extension_Name.equals(".xls"))
		{
			excel_work1=new HSSFWorkbook(input);
		}*/
		
		//create workbook
		XSSFWorkbook work=new XSSFWorkbook(input);
		
		//creating sheet object
		XSSFSheet sheet=work.getSheet("student");
		//get row
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		//create a loop for all row
		for(int i=0; i<rowcount+1; i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			//create a loop for print cell
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+"||");
			}
		}    
	System.out.println();
		
		
	}

}
