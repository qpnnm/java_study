package s0618_2;

//interface는 선언만 한다.
//접근 제어 자 . private , public은 다른 패키지에서도 작동가능 .!
// interface 는 무조건 ,public (안써도 ^^)

public class Animal implements Action {

	public void hug() {
		System.out.println("동물이 안겨와요~~");

	}

	public void cry() {
		System.out.println("동물이 울어요~");

	}

}
