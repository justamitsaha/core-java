package k.concurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

//You should use a concurrent collection class anytime that you are going to have multiple threads modify a collections object outside a synchronized block or method
public class G_ConcurrentCollections {
	public static void main(String[] args) {
		
		var foodData = new ConcurrentHashMap<String, Integer>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for(String key: foodData.keySet())
		   foodData.remove(key);
		System.out.println("h00-->" +foodData.size());
		
		var foodData1 = new HashMap<String, Integer>();
		foodData1.put("penguin", 1);
		foodData1.put("flamingo", 2);
		for(String key: foodData1.keySet())
		   foodData1.remove(key);
		System.out.println("hey-->" +foodData1.size());
	}
}
