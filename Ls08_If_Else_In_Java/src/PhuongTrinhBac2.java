import java.util.Scanner;

public class PhuongTrinhBac2 {
	public static void main(String[] args) {
		double a, b, c, x, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chuong trinh giai phuong trinh bac 2: ax^2 + bx + c = 0!");
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		System.out.println("Nhap vao so c: ");
		c = sc.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Phuong trinh " + a + "x^2 +" + b + "x + " + c + " = 0 vo nghiem!");
		} else {
			if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("Phuong trinh " + a + "x^2 +" + b + "x + " + c + " = 0 co nghiem kep: " + x);
			} else {
				x = (-b + Math.sqrt(delta)) / 2 * a;
				x2 = (-b - Math.sqrt(delta)) / 2 * a;
				System.out.println(
						"Phuong trinh " + a + "x^2 +" + b + "x + " + c + " = 0 co 2 nghiem phan biet: " + x +" "+ x2);
			}
		}
		sc.close();
	}
}
