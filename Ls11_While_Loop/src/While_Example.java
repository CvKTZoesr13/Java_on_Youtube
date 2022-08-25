import java.util.Scanner;

public class While_Example {
	public static void main(String[] args) {
//		int x = 1;
//		Scanner sc = new Scanner(System.in);
//		while (x != 0) {
//			System.out.println("Nhap x = 0 de thoat; Nhap ki tu khac de tiep tuc");
//			x = sc.nextInt();
//			if (x == 0) {
//				System.out.println("Thoat vong lap");
//				break;
//			}
//		}
		int n = 10;
		while (n % 3 < n / 3) {
			n--;
			System.out.println("abc" + n);
		}
		
		int a=10, b=5; int k = !(a/b<b) ? ++a : b++;
		System.out.println(k);
		int a1 = 2025;
		 do{int d=a1%10; a1 /=10; System.out.print(d);}while(a1!=0); 
		 for(int i=0, m=++i; m<2*i; i++, m+=i) {
			 System.out.println("wtf");
		 }
//		sc.close();
	}
}