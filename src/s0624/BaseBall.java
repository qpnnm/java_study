package s0624;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(10);
		Scanner s = new Scanner(System.in);
		System.out.print("맞춰봐:");
		String numStr = s.nextLine();
		while (rNum != Integer.parseInt(numStr)) {
			System.out.print("다시 해보렴:");
			numStr = s.nextLine();
			
		}
		System.out.printf("rNum=%d,느그대답=%s", rNum, numStr);
	}
}

