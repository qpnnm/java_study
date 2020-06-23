package s0623;

public class Execute {

	public static void main(String[] args) {
		Computer c;
		c = new Computer("Ryzen 3600 matiz", 16, "MSI B450A");
		c.upgrade(32);
		c.upgrade("i7 10700K","MSI Z470M");
		c.printInfo();

	}

}
