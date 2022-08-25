
public class Manufacturer {
	private String nameOfManufacturer;
	private Country country;
	public Manufacturer(String nameOfManufacturer, Country country) {

		this.nameOfManufacturer = nameOfManufacturer;
		this.country = country;
	}
	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}
	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}


	
}
