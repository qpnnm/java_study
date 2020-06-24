package s0624;

import java.util.List;
import java.util.ArrayList;

class Person {
	private String name;
	private int age;

	public String toString() {
		return "name:" + name + "\rage:" + age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;

	}
}

public class ListTest3 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>(3);
		pList.add(new Person());
		pList.add(new Person());
		pList.add(new Person());
		Person p = pList.get(1);
		p.setName("박경훈");
		p.setAge(48);
		System.out
		.println(p);
	

	}
}
