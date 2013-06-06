
public class Employee extends Customer {
	 private int employID;

	public int getEmployID() {
		return employID;
	}

	public void setEmployID(int employID) {
		this.employID = employID;
	}
	
	public String toString() {
		return "[Employee]" + super.toString();		
	}

}
