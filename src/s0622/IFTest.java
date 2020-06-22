package s0622;

public class IFTest {
//static void test() {
	
//}
	public static void main(String[] args) {
	
		/*
		 * int num1 = 1; int num2 = 10; int num3 = 20; if (num1 > 1 || num2 < 20 && num3
		 * == 21) { System.out.println("대충 니 생각이 맞아~");
		 * 
		 * 
		 * }
		 */
	
		
		double d = Math.random();
	int num = (int)(d*20)+1;
	System.out.println(num);
//	IFTest.test();	
 
	}
} 
//true 하나 나오면 그 후에 실행안함. or ||
//&& 일때도 false 하나나오면  실행 안함.(예외는 있다.) 그래서 괄호로 우선순위를 짜야함.