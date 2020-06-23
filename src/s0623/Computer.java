package s0623;

public class Computer {
	private String cpu;
	private int ram;
	private String board;

	Computer(String cpu, int ram, String board) {
		this.cpu = cpu;
		this.ram = ram;
		this.board = board;

	}

	void upgrade(String cpu) {
		this.cpu = cpu;
	}

	void upgrade(int ram) {
		this.ram = ram;
	}

	void upgrade(String cpu, String board) {
		this.cpu = cpu;
		this.board = board;
	}

	void printInfo() {
		System.out.println("CPU:" + cpu);// this. 생략되어있음. 상단 멤버변수
		System.out.println("RAM:" + ram + "G");
		System.out.println("Main Board:" + board);
	}
}
