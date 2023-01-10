package interview;

import java.util.HashMap;

public class Case1 {


public static void main(String[] args) {
	HashMap<Integer,String > hm = new HashMap<>();
	hm.put(1, "Rakesh");
	String n =hm.get(1);
	int count=0;
	for(int i=0;i<n.length();i++) {
		count++;
	}
	System.out.println(count);
}

}
