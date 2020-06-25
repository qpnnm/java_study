package s0625;

class Class {
public String toString() {
	return" 그래도 해야지 ~";
}
	public void study() {
		System.out.println("공부 하자! ! ! ");
	}

}

class HighClass extends Class {
	public void study() {
		System.out.println("공부 왜함");
	}
}

public class OverrideTest2 {
public static void main(String[] args) {

	

	Class c = new HighClass();
		c.study();
System.out.println(c.toString());
		
		
		
		

}
}