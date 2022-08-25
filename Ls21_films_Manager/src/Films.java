
public class Films {
	private String nameOfFilms;
	private int yearOfManufacture;
	private Manufacturer manufacturer;
	private double priceOfTicket;
	private premiereDay premiereDay;

	public Films(String nameOfFilms, int yearOfManufacture, Manufacturer manufacturer, double priceOfTicket,
			premiereDay premiereDay) {
		this.nameOfFilms = nameOfFilms;
		this.yearOfManufacture = yearOfManufacture;
		this.manufacturer = manufacturer;
		this.priceOfTicket = priceOfTicket;
		this.premiereDay = premiereDay;
	}

	public String getNameOfFilms() {
		return nameOfFilms;
	}

	public void setNameOfFilms(String nameOfFilms) {
		this.nameOfFilms = nameOfFilms;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPriceOfTicket() {
		return priceOfTicket;
	}

	public void setPriceOfTicket(double priceOfTicket) {
		this.priceOfTicket = priceOfTicket;
	}

	public premiereDay getPremiereDay() {
		return premiereDay;
	}

	public void setPremiereDay(premiereDay premiereDay) {
		this.premiereDay = premiereDay;
	}

	public boolean checkPriceCheaper(Films other) {
		return this.priceOfTicket < other.priceOfTicket;
	}

	public String getNameOfManufacturer() {
		return this.manufacturer.getNameOfManufacturer();
	}
	
	public double saleOff(double x) {
		return	this.priceOfTicket * (1 - x/100);
	}
}
