package az.edu.ada.wm2.firstspringapp.model;

public class Person{
	private String fName;
	private String lName;

	public Person(String fName, String lName) {
		 this.fName = fName;
		 this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		 return lName;
    }

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Person{" +
				"fName='" + fName + '\'' +
				", lName='" + lName + '\'' +
				'}';
	}
}