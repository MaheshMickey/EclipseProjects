package sorting;

public class Student implements Comparable<Student>{

	private String idNum;
    private String lName;
    private String fName;
    private double gpa;
    
    
	public Student(String idNum, String lName, String fName, double gpa) {
		super();
		this.idNum = idNum;
		this.lName = lName;
		this.fName = fName;
		this.gpa = gpa;
	}
	
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [idNum=" + idNum + ", lName=" + lName + ", fName=" + fName + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub	
		//return this.idNum.compareTo(o.idNum); // String class implements Comparable interface i.e the reason it is using compareTo method
		//return this.fName.compareTo(o.fName);
		//return this.lName.compareTo(o.lName);
		return Double.compare(this.gpa, o.gpa);
	}

    
	
	
    
    
}
