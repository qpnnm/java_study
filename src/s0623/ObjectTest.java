package s0623;

class Computer2 {
	String cpu;
	int ram;

	Computer2(String cpu, int ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
//member 변수
}

public class ObjectTest {
	Computer2 myComputer;

	ObjectTest() {

	}

	public static void main(String[] args) {
		Computer2 c = new Computer2("I5", 16);
	}

}
