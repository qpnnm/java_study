package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10) + 1;
			if (numList.indexOf(num) != -1) {
				i--;
//else 없으면 continue;
			} else {
				numList.add(num);
			}
		}
		System.out.println(numList);
	}
}
////		for (int i = 0; i < 10; i++) {
////			int num = (int) (Math.random() * 10) + 1;
////			numList.add(num);
////
////			for (int j = i - 1; j >= 0; j--) {
////				if (numList.get(i) == numList.get(j)) {
////					numList.remove(i);
////					i--;
////				}
////			}
////		}
//
//		System.out.println(numList);
//	}
//}

/*
 * int a = 1; Integer i = a; 대문자 class 데이터타입 long ln = 10000; Long l = ln;
 * 
 * boolean b1 = true; Boolean b = b1;
 * 
 * char c = 'a'; Character ch = c;
 */
