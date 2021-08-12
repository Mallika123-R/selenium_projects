import java.sql.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JDBC {

	String URL="jdbc:mysql://Localhost:3306/";
	String Driver="com.mysql.jdbc.Driver";
	String dbname="testing";
	String Uname="root";
	String Password="";
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet res=null;
	
	@BeforeTest
	public void DBTest()
	{
		try {
		Class.forName(Driver).newInstance();
		conn=DriverManager.getConnection(URL+dbname,Uname,Password);
		}
		catch(Exception e)
		{
			System.out.println("Could not establish Connection" +e.getMessage());
		}
		
		
	}
	@Test
	public void testDB()
	{
		
		try {
			Statement st=conn.createStatement();
		     st.executeUpdate("Delete from employee values('Sahil','Jalandhar','27')");
			res=st.executeQuery("Select * from Employee");
			while(res.next())
			{
				System.out.println(res.getString(1)+"----"+res.getString(2)+"---"+res.getInt(3));
			}
			System.out.println("-----------");
			//System.out.println("--- Shoppings----------------------");
			
			PreparedStatement pre=conn.prepareStatement("Select * from Employee where Place=? and AGE=?");
		   pre.setString(1, "Jalandhar");
			pre.setInt(2, 27);
			
			res=pre.executeQuery();
			
			while(res.next())
			{
				System.out.println(res.getString(1)+"----"+res.getString(2)+"---"+res.getInt(3));
			}
			
		} catch (Exception e) {
			System.out.println("Error in fetch query"+e.getMessage());
			e.printStackTrace();
			
		}
		
		
	}
	@AfterTest
	public void disconnect()
	{
		try {
			if((conn!=null) && (conn.isClosed()))
			{
				conn.close();
			}
			if((res!=null) && (pst!=null))
			{
				res.close();
				pst.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("The connection is not closed");
		}
	}
	
	
}
