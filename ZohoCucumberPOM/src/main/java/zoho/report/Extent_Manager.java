package zoho.report;

import java.io.File;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Manager {

	static ExtentReports reports;
	@Test
	public static ExtentReports getReports() {
		
		if(reports==null)
		{
			reports=new ExtentReports();
			Date d=new Date();
			System.out.println(d.toString().replaceAll(":", "_"));
		    String reportpath=System.getProperty("user.dir")+"//reports//"+d.toString().replaceAll(":","_");
		    String screenshotpath=System.getProperty("user.dir")+"//reports//"+"//screenshots";
		    File f=new File(screenshotpath);
		    f.mkdirs();
			ExtentSparkReporter sparks=new ExtentSparkReporter(reportpath); 
		     sparks.config().setReportName("This is my first Project");
		     sparks.config().setDocumentTitle("Journey of my life");
		     sparks.config().setTheme(Theme.DARK);
		     sparks.config().setEncoding("utf-8");
		     
		     reports.attachReporter(sparks);
		     
		   
		}
		return reports;
	}
	
}
