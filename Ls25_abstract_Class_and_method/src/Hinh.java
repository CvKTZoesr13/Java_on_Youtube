
public abstract class Hinh {
	protected ToaDo toaDo;
	
	public Hinh(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
// abstract method
	public abstract double tinhDienTich();

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	
}
