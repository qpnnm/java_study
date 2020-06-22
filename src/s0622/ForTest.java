package s0622;

public class ForTest {

	public static void main(String[] args) {
		int s1 = 0;
		int s2 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				s1 += i;
			} else {
				s2 += i;
			}

		}
		System.out.println("짝수의값"+s1);
		System.out.println("홀수의값"+s2);
		System.out.println("전체 값"+(s2+s1));
	}
}
