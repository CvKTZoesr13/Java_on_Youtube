import java.util.Scanner;

public class While_Example_2 {
	public static void main(String[] args) {
		int n, k;
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n > 0");
		n = sn.nextInt();
		k = n;
		String nhiPhan = "";
		while (n > 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}

		System.out.println("So nhi phan cua " + k + " la: " + nhiPhan);
		sn.close();
	}
}
