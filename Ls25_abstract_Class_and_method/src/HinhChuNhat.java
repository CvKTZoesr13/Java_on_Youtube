
public class HinhChuNhat extends Hinh {
	private int chieuRong, chieuCao;

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}

	public HinhChuNhat(ToaDo toaDo, int chieuRong, int chieuCao) {

		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		
		return this.chieuRong*this.chieuCao;
	}

}
