package s0623;
public class Person {
	private String name;
	private int age;
	private String address;
/*public Person() {
	this.age = (int)(Math.random()*30)+1;
}random  나이 만들기 !*/ 
	public String toString() {
		return "name :" + name + "\rage :" + age + "\raddress :" + address;

	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
	this.name = name;	
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
