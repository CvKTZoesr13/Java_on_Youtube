
public class HangSanXuat {
	private String tenHangSanXuat, tenQuocGia;
	// handle method
	public void operation1() {

	}
	// getter and setter method
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	// constructor method
	public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}

}
