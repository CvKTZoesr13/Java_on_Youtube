
public class test {
	public static void main(String[] args) {
		Date date1 = new Date(12, 4, 2002);
		Date date2 = new Date(24, 9, 2001);
		Date date3 = new Date(12, 04, 2000);
		
		Class class1 = new Class("KTPM01", "CNTT");
		Class class2 = new Class("QLKT02", "QTKD");
		Class class3 = new Class("CNM04", "CNM");
		
		Students student1 = new Students(01, "Nguyễn Văn A", date1, 3, class1);
		Students student2 = new Students(01, "Nguyễn Văn B", date2, 8, class2);
		Students student3 = new Students(01, "Nguyễn Văn C", date3, 9, class3);
		
		
		System.out.println(student1.getNameOfFacultyStudent());
		System.out.println(student2.getNameOfFacultyStudent());
		System.out.println(student3.getNameOfFacultyStudent());
		System.out.println("Student " + student1.getFullName() + " pass: " + student1.checkPass());
		System.out.println(student1.checkBirthday(student3));
	}
}
