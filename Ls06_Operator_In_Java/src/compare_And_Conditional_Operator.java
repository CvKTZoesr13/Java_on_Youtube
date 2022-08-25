import java.util.Scanner;

public class compare_And_Conditional_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b;
		System.out.println("Nhap vao so thuc a: ");
		a = sc.nextFloat();
		System.out.println("Nhap vao so thuc b: ");
		b = sc.nextFloat();
		System.out.println(a + " = " + b + " ?" + " " + (a == b));
		System.out.println(a + " = " + b + " ?" + " " + (a != b));
		System.out.println(a + " > " + b + " ?" + " " + (a > b));
		System.out.println(a + " < " + b + " ?" + " " + (a < b));
		System.out.println(a + " >= " + b + " ?" + " " + (a >= b));
		System.out.println(a + " <= " + b + " ?" + " " + (a <= b));
		System.out.println("Ca hai so thuc a va b la so chan ? " + (a%2 == 0 && b%2 == 0));
		System.out.println("Mot trong hai so thuc a va b la so chan ? " + (a%2 == 0 || b%2 == 0));
		
		//Ternary Operator
		System.out.println("----------");
		String ketQua = (a%2 == 0)? "So thuc a la so chan!": "So thuc a la so le!";
		System.out.println(ketQua);
		sc.close();
	}
}
