import java.util.LinkedHashMap;
import java.util.Map;

public class count_wordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "This this is is done by Saket Saket";
        String[] split=str.split(" ");
        int count=1;
        
        Map<String, Integer> map= new LinkedHashMap<String, Integer>();
        for(int i=0; i<split.length; i++)
        {
        	
        	if(map.containsKey(split[i]))
        		{
        		count= map.get(split[i]);
        		map.put(split[i], count+1);
        		}
        	
        	else
        	{
        		map.put(split[i], 1);
        	}
        	
        }
          System.out.println(map);

	}

}
