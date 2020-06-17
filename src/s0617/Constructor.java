package s0617;

public class Constructor {

	int a;

	Constructor() {
		System.out.println("나 쉬운 클래스 아니다!");

	}

	public static void main(String[] args) {

		Constructor c;
		System.out.println("c에 메모리 생성해서 대입하자!");
		c = new Constructor();
		System.out.println("c에 메모리 생성해서 대입했다!");

	}
}
//생성자는 data type 없고 
// 대소문자까지 클래스와 동일하다.2나 뒤에 뭘 붙일거면 void 를 앞에다 ..