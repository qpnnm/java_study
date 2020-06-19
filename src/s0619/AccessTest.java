package s0619;

import s0619.sub.SubTest;

public class AccessTest extends SubTest {

public void test() {

	System.out.println(num1);

	System.out.println(num2);
	
}
	public static void main(String[] args) {

		SubTest st = new SubTest();
		st.num1 = 10;
		st.num2 = 10;
		st.num3 = 10;
		st.num4 = 10;
		
//package 다르면 public 외에는 사용 불가능하다.
		
	}

}
//private이더라도 public method 사용하면( get , set) 을 앞에 붙이면 가져오거나 사용할 수 있다 
