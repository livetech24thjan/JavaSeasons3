package apr19th;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		System.out.println(hMap.size());
		
		hMap.put("Developer", "Ravi");
		hMap.put("Tester", "Gopi");
		hMap.put("BA", "Ram");
		
		System.out.println(hMap.size());
		
		Set<Entry<String, String>> entries=hMap.entrySet();
		
		//using for-each loop
		
		for(Entry<String, String> temp:entries)
		{
			System.out.println(temp.getKey()+"---"+temp.getValue());
		}
		
		

	}

}
