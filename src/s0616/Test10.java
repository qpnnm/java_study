package s0616;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("어디살아?");
		String address = scan.nextLine();

		if (address.equals("서울")) {
			System.out.println("얼~수도권~");

		} else if (address.equals("남양주")) {
			System.out.println("얼~해외~");

		} else {
			System.out.println("얼~지방~");

		}
	

//null 때문에 문자열 혹은 어떤 값을 변수랑 비교하는 것을 더 권장한다.
// if(a==null){

            // throw new Exception("마 a는 null 안돼!!") {
	
//} 
  //                 System.out.println("1".equals(a));
}
}
