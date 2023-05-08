package q16;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class Employee {
	String Fname;

	public Employee(String fname) {
		super();
		Fname = fname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Fname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Fname, other.Fname);
	}
}