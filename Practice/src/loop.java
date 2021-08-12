public class loop {
	public static void main(String args[])
	{
		int i[] = {0,1};
		try 
		{
			 i[2] = i[0] + i[1];
		}
	       catch(ArrayIndexOutOfBoundsException e1)
	       {
			System.out.println("1");
	       }
	      catch(Exception e2) 
	      {
			System.out.println("2");
	      }
	     finally 
	    {
		System.out.println(3);
	    }
	    System.out.println("4");  
	}
}
	   
	

/*


int index = 1;
Boolean [] test = new Boolean[3];
Boolean data = test[index];
What is the result?
		for(int i = 1; i < 3; i++)
			  for(int j = 3; j > i; j--)
			     assert i!=j {System.out.println(i); }
class test 
{
       public static void main(String args[])
	{
		int i[] = {0,1};
		try 
		{
			 i[2] = i[0] + i[1];
		}
	       catch(ArrayIndexOutOfBoundsException e1)
	       {
			System.out.println("1");
	       }
	      catch(Exception e2) 
	      {
			System.out.println("2");
	      }
	     finally 
	    {
		System.out.println(3);
	    }
	    System.out.println("4");  
	}
}*/