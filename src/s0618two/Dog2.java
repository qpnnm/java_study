package s0618two;

public class Dog2 extends Animal2 {
	public void speak(int a) {
 /// super.speak();
		System.out.println("강아지가 짖습니다.");
		
	}
	public static void main(String[] args) {
		Dog2 d = new Dog2();

		d.speak();
		
	} 
}
