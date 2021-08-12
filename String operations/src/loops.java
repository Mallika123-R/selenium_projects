
public class loops {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++)
		{
			System.out.println("Table of 4 *" +i+ "= " +i*4);
			
		}
		
		/*String x="Today is owsm day";
		
		for(int i=0; i<=x.length(); i++)
		{
			System.out.print(x.charAt(i));
		}*/

		  for(int i=1; i<=5; i++)
		  {
             System.out.println("Table of" +i);
			  for(int j=1; j<=5;j++)
			  {
				  System.out.println(i+"*" +j+"=" +i*j);
			  }
		  }
		  // while loop 
		  int i=1;
		  while(i<=10)
		  {
               
			  System.out.println(i);
			  
			  if(i==5)
				  break;
			  i++;
			  
		  }
	}

}
