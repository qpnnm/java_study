package s0624;

import java.util.List;
import java.util.ArrayList;

public class ListTest4 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		Person p = new Person();
		pList.add(p);
		p.setName("박민수");
		p.setAge(25);
		p = new Person();

		System.out.println(pList.get(0));

// 바라보는 주소값을 두개 보다 하나로 이동, 다시 바꾸려면 힘듬.

	}
}
