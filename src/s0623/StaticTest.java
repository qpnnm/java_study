package s0623;

public class StaticTest {

	static String str;
	int num;

	public static void main(String[] args) {
		System.out.println(str);// static 이면 변수 선언만해도 null로 초기화 해준다. + static 안쓰면 실행안된다
//default 는 class 에서 못씀.

		StaticTest st = new StaticTest();
		st.num = 10;
		System.out.println(st.num);
		StaticTest st2 = new StaticTest();
		
		System.out.println(st2.num);
	}
}
