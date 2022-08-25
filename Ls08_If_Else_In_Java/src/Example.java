import java.util.Scanner;

/**
 * 
 * @author ACER
 *
 */
public class Example {
	public static void main(String[] args) {
		double a, b, x;
		int z, t;

		Scanner SC = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = SC.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = SC.nextDouble();
		z = (int) a;
		t = (int) b;
		if (a > b) {
			System.out.println("So z lon hon so t!");
		} else if (z < t) {
			System.out.println("So z nho hon so t!");
		} else {
			System.out.println("So z bang so t!");
		}

		if (z % 2 == 0) {
			System.out.println("So " + z + " la so chan!");
		} else {
			System.out.println("So " + z + " la so le!");
		}
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh " + a + "x" + " + " + b + " = 0 co vo so nghiem!");
			} else {
				System.out.println("Phuong trinh " + a + "x" + " + " + b + " = 0 vo nghiem!");
			}

		} else {
			x = -b / a;
			System.out.println("Phuong trinh " + a + "x" + " + " + b + " = 0 co nghiem x = " + (x) * 100.0 / 100.0);
		}
		SC.close();
	}
}
