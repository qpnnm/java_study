package s0622;

public class IfTest2 {
	public static void main(String[] args) {
		System.out.println("검증시작");
		for (int i = 1; i <= 10000; i++) {
			double d = Math.random();

			int num1 = (int) (d * 20) + 1;

			if (num1 < 1 || num1 > 20) {
				System.out.println(num1 + ":뭔가이상함");
			}

		}
		System.out.println("검증종료");
	}
}