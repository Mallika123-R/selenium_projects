package runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class custom_runner {
    
	List<XmlSuite> mysuite;
	XmlSuite suite;
	List<XmlTest> testSuite;
	XmlTest test;
	Map<String,String> param;
	List<XmlClass> classes;
	XmlClass clas;
	List<XmlInclude> include;
	//String xmlinclude;
	TestNG testng;
	
	public custom_runner(int threadpoolsize){
		mysuite=new ArrayList<XmlSuite>();
		testng=new TestNG();
		testng.setSuiteThreadPoolSize(threadpoolsize);
		testng.setXmlSuites(mysuite);
		
			
	}
	//create a suite in list of suites
	public void createSuite(String suitename)
	{
		 suite=new XmlSuite();
		 suite.setName(suitename);
		 
		/* if(parallelTest)
			 suite.setParallel(ParallelMode.TESTS);*/
		 
		 mysuite.add(suite);
		 testSuite=new ArrayList<XmlTest>();
		 //suite.setTests(testSuite);
		
	}
	//add a test case inside the suite
	public void addTest(String name)
	{
		test=new XmlTest(suite);
		test.setName(name);
		
		param=new HashMap<String,String>();
		test.setParameters(param);
		
		classes=new ArrayList<XmlClass>();
		testSuite.add(test);
		
		
	}
	//set parameters
	public void setparam(String key, String value)
	{
		param.put(key,value);
	}
	
	//set a test class to List of classes in test
	public void addTestclass(String fullclassname, List<String> includeMethods)
	{
		clas=new XmlClass(fullclassname);
		include=new ArrayList<XmlInclude>();
		int i=0;
	    for(String name: includeMethods)
	    {
	    	//XmlInclude xmlinclude=new XmlInclude(name);
	    	include.add(new XmlInclude(name,i));
	    	i++;
	          //include.setName(name);
	    	//include.add(new XmlInclude(name));
	    	
	    	
	    }
	    clas.setIncludedMethods(include);
	    classes.add(clas);
	    	
	}
	public void run()
    {
    	testng.run();
    }
	

	}

