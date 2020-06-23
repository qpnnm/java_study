package s0623;

public class ExecuteCat {

	public static void main(String[] args) {

		Cat[] cats = new Cat[20];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();
			cats[i].setName("고양이" + i);
			cats[i].setAge(i);
		}
		for (Cat cat : cats) {
			System.out.println(cat);
		
		}
	}

}
