
public class Manufacturer {
	private String nameOfManufacturer;
	private String region;

	public Manufacturer(String nameOfManufacturer, String region) {

		this.nameOfManufacturer = nameOfManufacturer;
		this.region = region;
	}

	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}

	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
