package map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<>();
	hm.put(1, "rakesh");
	hm.put(2, "jai");
	hm.put(3, "han");
	hm.put(4, "rakesh");
	hm.put(4, "kalesg");
	
	System.out.println(hm.size());
	
	System.out.println(hm);
	System.out.println(hm.keySet());
	System.out.println(hm.values());

	for(Map.Entry<Integer, String> i:hm.entrySet()) {
		System.out.println(i);
	}
	
	}
}
