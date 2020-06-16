package s0616;

import java.util.Scanner;

public class Test10 {
public static void main(String[] args) {
	
  Scanner scan = new Scanner(System.in);
	
	System.out.println("어디살아?");
	String address = scan.nextLine();
	System.out.println("서울"=="서울");
	if(address.equals("서울")) {
		System.out.println("얼~수도권~");
	
	} else { System.out.println("얼~지방~");
      
	}
   }
}

	