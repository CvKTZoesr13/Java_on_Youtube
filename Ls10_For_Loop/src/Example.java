import java.util.Scanner;


public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao so lan lap: ");
		n = sc.nextInt();
		for (int i = 1; i < n + 1; i++) {
			System.out.println(i + ". Hello World!");
		}
		sc.close();
	}
}
