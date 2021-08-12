package collections_API;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class client {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String Reflection= "add";
	
		
		int x=100;
		int y=200;
		Reflection r= new Reflection();
		Method m= r.getClass().getMethod(Reflection,int.class,int.class);
		m.invoke(r, x,y);

	}

}
