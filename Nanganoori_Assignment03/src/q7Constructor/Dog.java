package q7Constructor;

public class Dog {
	public String dogName;
	
	public Dog(String dogName) {
		super();
		this.dogName = dogName;
	}
	
//	public final Dog(String dogName) {
//		super();
//		this.dogName = dogName;
	//can't be created with final keyword
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("e");
	}
}

