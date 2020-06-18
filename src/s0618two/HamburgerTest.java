package s0618two;

public class HamburgerTest {
	public static void main(String[] args) {

		OverridingTest op = new OverridingTest();
		OverridingTest2 op2 = new OverridingTest2();
		op.price();
		op2.price();

	}
}
