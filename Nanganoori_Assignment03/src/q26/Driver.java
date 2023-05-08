package q26;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x  = Singleton.getInstance();
		Singleton y  = Singleton.getInstance();
		System.out.println("Hashcode for x is: "+x.hashCode());
		System.out.println("Hashcode for y is: "+y.hashCode());
		if(x == y)
		{
			System.out.println("Both point to same memory location");
		}
		else {
			System.out.println("Different locaiton");
		}
	}

}
