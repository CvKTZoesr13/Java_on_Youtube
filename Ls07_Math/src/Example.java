import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();

		// ham lay tri tuyet doi
		System.out.println("|a| = " + Math.abs(a));
		// ham tim min
		System.out.println("min(a,b) = " + Math.min(a, b));
		// ham tim max
		System.out.println("max(a,b) = " + Math.max(a, b));
		// Ham lam tron tren
		System.out.println("ceil(a) = " + Math.ceil(a));
		// Ham lam tron duoi
		System.out.println("floor(a) = " + Math.floor(a));
		// Ham can bac 2
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		// Ham so mu
		System.out.println("pow(a,b) = " + Math.pow(a, b));
		sc.close();
	}
}
