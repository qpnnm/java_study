package homework;

public class Class extends School {
	public void teach() {

		System.out.println("가르치는 중.");
	}

	public static void main(String[] args) {
		School s = new Class();
		s.teach();
	}

}
