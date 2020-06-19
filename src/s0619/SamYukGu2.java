package s0619;

public class SamYukGu2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print("짝");
			}else {
				System.out.print(i);
			}
			if (i % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
}
	}
}