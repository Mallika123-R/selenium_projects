package com.Interview_Practice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic_testNG {
	
	@Parameters({ "browser" })
	@Test
	public void firstTest(String browser) {
		System.out.println("browser passed as :- " + browser);
	}
    
    @Test(groups="HR_department")
    public void secondTest() {
        
        System.out.println("Second Test");
    }
  
    @Test(groups="IT_department")
    public void thirdTest() {
        System.out.println("Third Test");
        
    }
    
    @Test(groups="IT_department")
    public void fourthTest() {
        System.out.println("Fourth Test");
    }
    @Test(groups="HR_department")
    public void fifthTest() {
        System.out.println("fifth Test");
    }

}
