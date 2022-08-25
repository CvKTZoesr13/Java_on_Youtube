import java.util.Scanner;

public class BaiTap_HinhTron {
	public static void main(String[] args) {
		double r, S, C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh r: ");
		r = sc.nextDouble();
		// Tinh chu vi
		C = 2*r*Math.PI;
		// Tinh dien tich
		S = Math.pow(r,2) * Math.PI;
		System.out.println("Chu vi: " + Math.round(C)*100.0/100.0);
		System.out.println("Dien tich: " + Math.ceil(S));
		sc.close();
	}
}
