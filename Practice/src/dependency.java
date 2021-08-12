  
import org.testng.annotations.Test;  
public class dependency  
{  
 @Test(enabled=false)  
 public void testcase1()  
 {  
     System.out.println("testcase1");  
 }  
 @Test   
 public void testcase2()  
 {  
     System.out.println("testcase2");  
 }  
}