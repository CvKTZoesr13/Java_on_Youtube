import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Nhap vao so nguyen x: ");
		x = sc.nextInt();
		switch(x) {
		case 1: 
			System.out.println("Ban da nhap vao so "+x);
			break;
		case 2: 
			System.out.println("Ban da nhap vao so "+x);
			break;
		case 3: 
			System.out.println("Ban da nhap vao so "+x);
			break;
		case 4: 
			System.out.println("Ban da nhap vao so "+x);
			break;
		case 5: 
			System.out.println("Ban da nhap vao so "+x);
			break;
		case 6: 
			System.out.println("Ban da nhap vao so "+x);
			break;
		case 7: 
			System.out.println("Ban da nhap vao so "+x);
			break;
			default: 
				System.out.println("Ban da nhap vao mot ky tu khac gia tri tu 1 -> 7");
		}
		sc.close();
	}
}