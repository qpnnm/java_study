package s0624;

public class StringArray3 {

	public static void main(String[] args) {
		String str = "1,23124,1242316,432764,12346236,1233457,2355134,680,1276496,578759";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for (int i = 0; i < nums.length; i++) {
			if (Integer.parseInt(strs[i]) % 2 == 0) {
				nums[i] = Integer.parseInt(strs[i]);
			}
		}
		for (int num : nums) { 

			System.out.println(num);
		}
	
	}
}


