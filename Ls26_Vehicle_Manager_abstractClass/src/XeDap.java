
public class XeDap extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	





	public XeDap(String tenLoaiPhuongTien, HangSanXuat hsx, String loaiNhienLieu) {
		super(tenLoaiPhuongTien, hsx);
		this.loaiNhienLieu = loaiNhienLieu;
	}



	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}



	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}



	
}
