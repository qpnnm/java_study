package s0616;

public class Person {
	String name;
	String address;
	int age;
//default 는 같은패키지 안에서.
	void run() {
		System.out.println(name + "이 달립니다.");//this. 생략.
		if (age > 30) {
			System.out.println(age + "가 되니까 지치는구나.");

		} else {
			System.out.println("쌩썡하구만!!");

		}
	}

	public static void main(String[] args) {

		Person[]people = new Person[5];
		people[0] = new Person();
		people[0] = new Person();
		people[0] = new Person();
		people[0] = new Person();
		people[0] = new Person();
       System.out.println(people[0].name);
       
	}
}
