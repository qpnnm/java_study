package s0624;

import java.util.Random;
import java.util.Scanner;

public class Gbb {
	public static void main(String[] args) {
		String[] strs = { "가위", "바위", "보" };
		Random r = new Random();
		int rNum = r.nextInt(3);
		System.out.println("가위바위보!");
		Scanner s = new Scanner(System.in);
		String mine = s.nextLine();
		System.out.println(strs[rNum]);
		while(!strs[rNum].equals(mine)) {
			
		}
		if (strs[rNum].equals(mine)) {
			System.out.println("다시");
		}else {
			if("가위".equals(strs[rNum])) {System.out.println("짐");
				if("바위".equals(mine)) {
					System.out.println("이김");
				}
			}
		}

	}
}
