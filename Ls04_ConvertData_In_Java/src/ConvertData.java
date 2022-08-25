import java.util.Scanner;

/**
 * 
 * @author ACER
 *
 */
//chuyen doi kieu du lieu (ep kieu)
public class ConvertData {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int x = 100;
		int y = 2;
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		float z = x;
		float t = y;
		System.out.println("z = "+ z);
		System.out.println("t = "+ t);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap vao so b: ");
		float b = sc.nextFloat();
		int c = (int) a;
		int d = (int) b;
		System.out.println("So "+ a + " sau khi chuyen ve kieu nguyen la: "+ c);
		System.out.println("So "+ b + " sau khi chuyen ve kieu nguyen la: "+ d);
		
		// Ep kieu giua du lieu nguyen thuy sang kieu doi tuong
		float e = new Integer(32);
		System.out.println("e = " + e);
		sc.close();
		
	}
}
