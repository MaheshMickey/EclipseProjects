package withDogObjects;

public class Dog implements Comparable<Dog> {
	private String dogname;
	private int dogage;
	public Dog(String dogname, int dogage) {
		super();
		this.dogname = dogname;
		this.dogage = dogage;
	}
	public String getDogname() {
		return dogname;
	}
	public void setDogname(String dogname) {
		this.dogname = dogname;
	}
	public int getDogage() {
		return dogage;
	}
	public void setDogage(int dogage) {
		this.dogage = dogage;
	}
	@Override
	public String toString() {
		return "Dog [dogname=" + dogname + ", dogage=" + dogage + "]";
	}
	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return this.dogname.compareTo(o.dogname);
	}
	
	
}
