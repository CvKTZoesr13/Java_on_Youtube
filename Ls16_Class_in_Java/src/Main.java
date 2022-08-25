import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		MyDate md = new MyDate (12,12,12);
		md.printDate();
		md.printDay();
		md.printMonth();
		HoaDonCaPhe x = new HoaDonCaPhe("Trung Nguyen", 1000.0, 1.5);
		System.out.println("Tong tien: " + x.TinhTongTien());
		System.out.println("Kiem tra khoi luong > 2kg: " + x.checkKg(2));
		System.out.println("Giam gia cua hoa don: "+ x.Sales(10));
	}
}
