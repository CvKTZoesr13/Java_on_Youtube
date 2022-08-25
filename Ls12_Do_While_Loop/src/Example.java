import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many do you want I say 'Hello World'? Please enter times less than 12! ");
		a = sc.nextInt();
		do {
			System.out.println("Hello World!");
			a ++;
		}while(a <= 11 && a >= 0);
		
		sc.close();
	}
}
