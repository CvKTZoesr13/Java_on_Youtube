import java.util.Scanner;

/**
 * 
 * @author ACER
 *
 */
public class Example_For_Operator {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao b: ");
		b= sc.nextInt();
		int sum = a + b;
		System.out.println(a +" + "+ b + " = "+ sum );
		int hieu = a - b;
		System.out.println(a +" - "+ b + " = "+ hieu );
		int tich = a*b;
		System.out.println(a +" * "+ b + " = "+ tich );
		float thuong = (float) a / b;
		System.out.println(a +" / "+ b + " = "+ thuong );
		int soDu = a % b;
		System.out.println(a +" % "+ b + " = "+ soDu );
		sc.close();
	}
}