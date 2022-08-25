
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(12, 4);
		ToaDo td2 = new ToaDo(7, 4);
		ToaDo td3 = new ToaDo(8, 0);
		
		Hinh h1 = new Diem(td2);
		Hinh h2 = new HinhTron(td1, 10);
		Hinh h3= new HinhChuNhat(td3, 6, 3) ;
		System.out.println("dt1: " + h1.tinhDienTich());
		System.out.println("dt2: " + h2.tinhDienTich());
		System.out.println("dt3: " + h3.tinhDienTich());
		
	}
}