package s0618two;

public class OverridingTest2 extends OverridingTest {
	public void price() {
		System.out.println("세트 가격은 " + (hamburger + coke + potato - 500) + "원");

	}
	
	public static void main(String[] args) {
		OverridingTest ot = new OverridingTest2();
		ot.price();
	}
}
