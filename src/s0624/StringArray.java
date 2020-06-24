package s0624;

public class StringArray {

	public static void main(String[] args) {

		String lottoNums = "10,21,5,19,51,17";
		int[] nums = new int[6];
		int c = 0;
		while (lottoNums.indexOf(",") != -1) {

			int idx = lottoNums.indexOf(",");
			String num1 = lottoNums.substring(0, idx);
			nums[c++] = Integer.parseInt(num1);
			lottoNums = lottoNums.substring(idx + 1);
		}
		nums[c] = Integer.parseInt(lottoNums);

		for (int num : nums) {
			System.out.println(num);
		}
	}
}
