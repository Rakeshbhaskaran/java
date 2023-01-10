package interview;

import java.util.HashMap;

public class countUsingHashMap {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<>();
		String s ="Karnatka";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		
	}

}
