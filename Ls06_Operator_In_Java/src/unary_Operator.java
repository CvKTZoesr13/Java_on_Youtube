import java.util.Scanner;

public class unary_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhap vao so nguyen a: ");
		a = sc.nextInt();
		boolean b = false;
		System.out.println(" - => gia tri: "+ (-a));
		System.out.println(" + => gia tri: "+ (+a));
		System.out.println(" !b => gia tri: " + (!b));
		System.out.println("------");
		System.out.println("a = "+a);
		System.out.println("++a => co gia tri: "+ (++a));
		System.out.println("a++ => co gia tri: "+ (a++));
		System.out.println("--a => co gia tri: "+ (--a));
		System.out.println("a-- => co gia tri: "+ (a--));
		System.out.println(a);
		sc.close();
	}
}
