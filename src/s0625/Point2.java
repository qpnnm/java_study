package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생 몇명? : ");
		int cnt = Integer.parseInt(s.nextLine());
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < cnt; i++) {
			System.out.print(i + "번째 학생 점수는?: ");
			intList.add(Integer.parseInt(s.nextLine()));

		}
		System.out.println(intList);

		int maxNum = 0;
		int maxidx = -1;
		int minNum = 100;
		int minidx = -1;
		for (int i = 0; i < intList.size(); i++) {
			if (i==0 || maxNum < intList.get(i)){
				maxNum = intList.get(i);
				maxidx = i;

			} else if (i == 0 || minNum > intList.get(i))
				minNum = intList.get(i);
			    minidx = i;
		}
		System.out.println((maxidx + 1) + "번째 있는 사람이 1등! 점수는 :" + maxNum + "점");
		System.out.println((minidx + 1) + "번째 있는 사람이 꼴등! 점수는:" + minNum + "점");

	}

}
