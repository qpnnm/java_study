package s0625;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력해");
		String pointStr = scan.nextLine();
		int point = -1;
		while (point < 0) {
			try {
				point = Integer.parseInt(pointStr);
				if (point == 0) {
					throw new Exception("0은 안돼.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("입력하신 점수를 읽을 수 없습니다.");
				System.out.print("try again.");
				pointStr = scan.nextLine();
			}
		}
		System.out.println("니 점수:" + point);
	}
}
//double 은 Double.parseDouble