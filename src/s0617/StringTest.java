package s0617;

public class StringTest {
	static int length(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			cnt++;
		}
		return cnt;

	}

	public static void main(String[] args) {

		String str = "씨발새끼얌ㅋ";
		int cnt = length(str);
	
		
		System.out.println();
		System.out.println();
		System.out.println();
///		System.out.println(str.length());
///		System.out.println(str.lastIndexOf("얌"));
///		System.out.println(str.replace("씨발", "**"));
		
	}
}
