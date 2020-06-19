package s0619;

public class ArrayTest {

	String[] strs;

	int a;

	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();

		at.strs = new String[3];
		at.strs[0] = "응급실떡볶이";
		String tmpstr = at.strs[0];
		at.strs = new String[4];
		at.strs[0] = tmpstr;
		System.out.println(at.strs[0]);

		/*
		 * int num1 = 4; int num2 = 5; int num3; num3 = num1; num1 = num2; num2 = num3;
		 * 
		 * System.out.println(num1); System.out.println(num2);
		 */
		// System.out.println(at.strs); null
		// System.out.println(at.a); 0
	}
}
