package interview;

import java.util.ArrayList;
import java.util.HashSet;

public class Intq2Q7 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(1);
		
		HashSet h = new HashSet<>(a);
		for(Object e:h) {
			System.out.println(e);
		}
	}

}
