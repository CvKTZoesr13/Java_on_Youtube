
public class Class {
	private String nameOfClass;
	private String nameOfFaculty;

	public Class(String nameOfClass, String nameOfFaculty) {

		this.nameOfClass = nameOfClass;
		this.nameOfFaculty = nameOfFaculty;
	}

	public String getNameOfClass() {
		return nameOfClass;
	}

	public void setNameOfClass(String nameOfClass) {
		this.nameOfClass = nameOfClass;
	}

	public String getNameOfFaculty() {
		return nameOfFaculty;
	}

	public void setNameOfFaculty(String nameOfFaculty) {
		this.nameOfFaculty = nameOfFaculty;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameOfClass + "/" + this.nameOfFaculty; 
	}
}
