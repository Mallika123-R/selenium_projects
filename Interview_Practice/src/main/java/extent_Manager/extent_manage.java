package extent_Manager;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_manage {

	static ExtentReports reports;
	public static String Screenshot;
	
	
	@Test
	public static ExtentReports getTest()
	{
		if(reports==null)
		{
		reports=new ExtentReports();
		Date d=new Date();
		String reportPath=System.getProperty("user.dir")+"//reports//"+d.toString().replaceAll(":","_");
		Screenshot=System.getProperty("user.dir")+"//reports//"+"//screenshot";
		
		File f=new File(Screenshot);
		f.mkdirs();
		
		ExtentSparkReporter sparks= new ExtentSparkReporter(reportPath);
		sparks.config().setReportName("This is my fir project");
		sparks.config().setDocumentTitle("My life");
		sparks.config().setTheme(Theme.DARK);
		sparks.config().setEncoding("utf-8");
		
		reports.attachReporter(sparks);
		}
		return reports;
		
	}
	
}
