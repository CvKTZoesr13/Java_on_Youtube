
public class Student extends Human{


	private String tenLop, tenTruong;

	public Student(String fullName, int birthday, String tenLop, String tenTruong) {
		super(fullName, birthday);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public void lamBT() {
		System.out.println("Lam bai tap");
	}
	public static void main(String[] args) {
		Human hn = new Human("Cvktzoesr", 2020);
		hn.getBirthday();
		Student std = new Student("Nguyen van a", 2022, "cntt", "nguyen van b");
		System.out.println(std.getBirthday());
		std.lamBT();
	}
}
