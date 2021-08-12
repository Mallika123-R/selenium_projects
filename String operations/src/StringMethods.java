
public class StringMethods {
	
	// WAP string s="Mal@lika wa@dhw@a   "
	      //a--->$
	      //remove last space of ech word
	     //combine both the words
	  //break the wword where @ is present
	/*
	Output should be -->  M$l
	                      lik$
	                      w$
	                      dhw
	                      $*/
	public static void main(String[] args) {
		
		String s="Mal@lika wa@dhw@a   ";
		String replace=s.replace("a","$");
		String remove_space=replace.replaceAll(" ","");
		System.out.println("After Replace--->"+replace);
		System.out.println("After remove space-->\""+s.trim()+"\"");
		System.out.println("Combine both words-->"+replace.replaceAll(" ",""));
		String str[]=remove_space.split("@");
		
		for(String ss: str)
		{
			System.out.println("Break the word-->"+ss);
		}
		
	}

}
