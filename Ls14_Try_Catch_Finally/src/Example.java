import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.println("Nhap vao so nguyen n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhap du lieu sai!");
		} finally {
			
		}

		System.out.println("Gia tri vua nhap la: " + n);
		System.out.println("Ket thuc chuong trinh!");
		sc.close();
	}
}
