
public class test {
	public static void main(String[] args) {
		Date ngay1 = new Date(15, 8, 2025);
		Date ngay2 = new Date(1, 3, 2025);
		Date ngay3 = new Date(6, 9, 2025);
		
		Country quocGia1 = new Country("VN", "VietNam");
		Country quocGia2 = new Country("USA", "America");
		Country quocGia3 = new Country("TW", "Taiwain");
		
		Manufacturer hangSanXuat1 = new Manufacturer("VNLaptop", quocGia1);
		Manufacturer hangSanXuat2 = new Manufacturer("Macbook", quocGia2);
		Manufacturer hangSanXuat3 = new Manufacturer("Asus", quocGia3);
		
		Computers mayTinh1 = new Computers(hangSanXuat1, ngay1, 1500, 12);
		Computers mayTinh2 = new Computers(hangSanXuat2, ngay2, 2000, 24);
		Computers mayTinh3 = new Computers(hangSanXuat3, ngay3, 1000, 12);
		
		System.out.println("So sánh giá thấp hơn: ");
		System.out.println("M1 < M2: "+ mayTinh1.checkPriceIsCheaper(mayTinh2));
		System.out.println("M1 < M3: "+ mayTinh1.checkPriceIsCheaper
				(mayTinh3));
		
		
		System.out.println("Tên quốc gia: ");
		System.out.println("M1: "+ mayTinh1.getNameOfCountryComputer());
		System.out.println("M2: "+ mayTinh2.getNameOfCountryComputer());
		System.out.println("M3: "+ mayTinh3.getNameOfCountryComputer());
	}

}
