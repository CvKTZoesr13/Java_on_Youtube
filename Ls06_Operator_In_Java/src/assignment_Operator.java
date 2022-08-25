import java.util.Scanner;

public class assignment_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen a: ");
		float a;
		// các phép gán
		a = sc.nextFloat();
		System.out.println("a = "+a);
		a += 3;
		System.out.println("a + 3 = "+ a);
		a -= 3;
		System.out.println("a - 3 = "+ a);
		a /= 3;
		System.out.println("a / 3 = "+ a);
		a *= 3;
		System.out.println("a * 3 = "+ a);
		a %= 3;
		System.out.println("a chia 3 du "+ a);
		sc.close();
	}
}
