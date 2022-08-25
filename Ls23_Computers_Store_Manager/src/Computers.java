
public class Computers {
	private Manufacturer manufacturer;
	private Date dateOfManufacture;
	private double price;
	private int insurance;
	public Computers(Manufacturer manufacturer, Date dateOfManufacture, double price, int insurance) {
		this.manufacturer = manufacturer;
		this.dateOfManufacture = dateOfManufacture;
		this.price = price;
		this.insurance = insurance;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	
	public boolean checkPriceIsCheaper(Computers other) {
		return this.price < other.price;
	}
	
	public String getNameOfCountryComputer() {
		return this.manufacturer.getCountry().getNameOfCountry();
	}
	
}
