
public class string_stringBuffer {

	  public static String concatWithString()
	  {
		  String t="java";
		  for (int i=0; i<10000; i++){ 
			  
		  t=t+"Point";
		  }
		  return t;
		  
	  }
	  public static String concatWithStringbuffer()
	  {
		 StringBuffer buffer=new StringBuffer("java");
		 for (int i=0; i<10000; i++){ 
			
		  buffer=buffer.append("point");
		 }
		  return buffer.toString();
	  }
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println(System.currentTimeMillis());
		System.out.println("Start Time--"+startTime);
		System.out.println("Time of concat with String---"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		concatWithStringbuffer();
		System.out.println(System.currentTimeMillis());
		System.out.println("Start Time--"+startTime);
		System.out.println("Time of concat with StringBuffer---"+(System.currentTimeMillis()-startTime)+"ms");
		

	}

}
