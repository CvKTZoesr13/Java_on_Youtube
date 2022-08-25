
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String fullName = sc.nextLine();
		System.out.println("Nhap vao ma sinh vien: ");
		final int Sid = sc.nextInt();
		System.out.println("Nhap vao diem thi: ");
		float mark = sc.nextFloat();
		System.out.println("----------");
		System.out.println("Ho va ten: "+fullName);
		System.out.println("----------");
		System.out.println("Ma sinh vien: "+Sid);
		System.out.println("----------");
		System.out.println("Diem thi: "+mark);
		System.out.println("----------");
		sc.close();
	}
}
