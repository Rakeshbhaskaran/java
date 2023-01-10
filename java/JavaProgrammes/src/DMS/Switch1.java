package DMS;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		System.out.println("Enter month as int ");
		Scanner a = new Scanner(System.in);
		int m=a.nextInt();
		switch(m) {
		case 1:System.out.println("january"); 
		break;
		case 2:System.out.println("feb");
		break;
		case 7:System.out.println("july");
		break;
		default:System.out.println("not there");
		
		}
		
		
	}

}
