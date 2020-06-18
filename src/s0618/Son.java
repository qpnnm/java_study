package s0618;

public class Son extends Father {
	Son() {
		System.out.println("난 나중이지!");
	}

	int money = 100000000;

	public static void main(String[] args) {
		new Son();

		/*
		 * Son s = new Son(); s.name = "손흥민"; System.out.println(s.name + "이 가진 돈은" +
		 * s.money + "원 입니다.");
		 * 
		 * Father f = new Son(); Son s2 = (Son) f;
		 * 
		 * System.out.println("아빠가 가진돈은 아들이 가진 돈이" +
		 * s2.money+"원 이기 때문에"+s2.money+"원 입니다."); // Error 아빠가 가진돈은 모른다.Son s2 = (Son)
		 * f; 라는 선언이 없으면 상속이 안되기 때문에.
		 * 자료형 변수;
		 * 정수 실수 문자 문자열 논리형 
		 * 정해져 있는것 : 원시형
		 * 정해져 있지 않은것 : 레퍼런스형 (창조형)
		 * 클래스
		 * 메소드  return 하는 것과 return하지 않는것(void) 으로 나뉜다
		 * overloading 
		 *
		 * 생성자 : 데이터 타입 자체가 없다 . 생성자가 없다면 자바가 컴파일 할 떄 자동으로 만들어준다.
		 *
		 * 상속 
		 * extends
		 * 
		 *  
		 */
	}
}
