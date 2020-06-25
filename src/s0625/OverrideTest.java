package s0625;

class Test {
	public String toString() {
		return "메모리 주소 지겹잖아?";
	}

	public void run() {
		System.out.println("그냥 달려");
	}
}

class SubTest extends Test {
	public String toString() {
		return"안지겨워 "; 
	}
	public void feed() {
		System.out.println("밥");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Test t = new SubTest();

		System.out.println(t.toString());
	}
}
