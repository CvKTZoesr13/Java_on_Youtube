
public abstract class PhuongTienDiChuyen {
		protected String tenLoaiPhuongTien;
		protected HangSanXuat hsx;
		
		public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hsx) {
			super();
			this.tenLoaiPhuongTien = tenLoaiPhuongTien;
			this.hsx = hsx;
		}
		// abstract method
		public abstract double layVanToc();
		// getter and setter methods
		public String getLoaiPhuongTien() {
			return tenLoaiPhuongTien;
		}
		public void setLoaiPhuongTien(String loaiPhuongTien) {
			this.tenLoaiPhuongTien = loaiPhuongTien;
		}
		public HangSanXuat getHsx() {
			return hsx;
		}
		public void setHsx(HangSanXuat hsx) {
			this.hsx = hsx;
		}
		
		// handle methods
		public String layTenHangSanXuat() {
			return this.hsx.getTenHangSanXuat();
		}
		
		public void khoiDong() {
			System.out.println("Khoi dong");
		}
		public void tangToc() {
			System.out.println("Tang toc");
		}
		public void tatMay() {
			System.out.println("Tat may");
		}
		
}
