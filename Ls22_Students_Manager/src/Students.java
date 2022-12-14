import java.util.Objects;

public class Students {
	private int studentID;
	private String fullName;
	private Date birthday;
	private float avgOfMark;

	private Class classOfSchool;

	public Students(int studentID, String fullName, Date birthday, float avgOfMark, Class classOfSchool) {

		this.studentID = studentID;
		this.fullName = fullName;
		this.birthday = birthday;
		this.avgOfMark = avgOfMark;
		this.classOfSchool = classOfSchool;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public float getAvgOfMark() {
		return avgOfMark;
	}

	public void setAvgOfMark(float avgOfMark) {
		this.avgOfMark = avgOfMark;
	}

	public Class getClassOfSchool() {
		return classOfSchool;
	}

	public void setClassOfSchool(Class classOfSchool) {
		this.classOfSchool = classOfSchool;
	}

	public String getNameOfFacultyStudent() {
		return this.classOfSchool.getNameOfFaculty();
	}

	public boolean checkPass() {
		return this.avgOfMark >= 5.0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Float.floatToIntBits(avgOfMark) == Float.floatToIntBits(other.avgOfMark)
				&& Objects.equals(birthday, other.birthday) && Objects.equals(classOfSchool, other.classOfSchool)
				&& Objects.equals(fullName, other.fullName) && studentID == other.studentID;
	}

	public boolean checkBirthday(Students other) {
		return this.birthday.getDay() == other.birthday.getDay()
				&& this.birthday.getMonth() == other.birthday.getMonth()
				&& this.birthday.getYear() == other.birthday.getYear();
	}

}
