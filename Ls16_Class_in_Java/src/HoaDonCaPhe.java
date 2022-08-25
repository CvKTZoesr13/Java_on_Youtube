
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1kg;
	private double khoiLuong;

//	public HoaDonCaPhe(String string, double d, double e) {
//		// TODO Auto-generated constructor stub
//	}
	public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien, double khoiLuong) {
		this.setTenLoaiCaPhe(tenLoaiCaPhe);
		this.giaTien1kg = giaTien;
		this.khoiLuong = khoiLuong;
	}

	public double TinhTongTien() {

		return this.giaTien1kg * this.khoiLuong;
	}

	public boolean checkKg(double khoiLuong) {
		return this.khoiLuong > khoiLuong;
	}

	public String getTenLoaiCaPhe() {
		return tenLoaiCaPhe;
	}

	public void setTenLoaiCaPhe(String tenLoaiCaPhe) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
	}

	public boolean CheckGreater500k() {
		return this.TinhTongTien() > 500;
	}

	public double Sales(double sale) {
		if (this.TinhTongTien() >= 500) {
			return (sale / 100) * this.TinhTongTien();
		} else {
			return 0;
		}
	}
}
