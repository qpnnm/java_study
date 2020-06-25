package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point3 {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			Student s = new Student();
			s.setName("이름" + i);
			s.setPoint(r.nextInt(101));
			stList.add(s);
		}
		int max = 0;
		int min = 0;
		String maxName = "";
		String minName = "";
		for (int i = 0; i < stList.size(); i++) {
			Student st = stList.get(i); // -> 치환 가능 ... 점수랑 비교해야해서 getPoint 붙임
			if (i == 0) {
				min = stList.get(i).getPoint();
				max = stList.get(i).getPoint();
				maxName = st.getName();
				minName = st.getName();
			}
			if (min > stList.get(i).getPoint()) {
				min = stList.get(i).getPoint();
				minName = st.getName();
			}
			if (max < stList.get(i).getPoint()) {
				max = stList.get(i).getPoint();
				maxName = st.getName();
			}
		}
		System.out.println(stList);
		System.out.println("[1등 : "+maxName+ "--점수: " + max + "점]");
		System.out.println("[꼴등: "+ minName + "--점수: " + min + "점]");

	}
}
