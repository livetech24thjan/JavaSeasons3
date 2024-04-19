package apr19th;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap=new HashMap<Integer, String>();
		
		System.out.println(hMap.size());
		
		hMap.put(101, "Ravi");
		hMap.put(102, "Gopi");
		hMap.put(103, "Ram");
		
		System.out.println(hMap.size());
		
		Set<Entry<Integer, String>> entries=hMap.entrySet();
		
		//using for-each loop
		
		for(Entry<Integer, String> temp:entries)
		{
			System.out.println(temp.getKey()+"---"+temp.getValue());
		}
		
		System.out.println(hMap.containsValue("Sam"));

	}

}
