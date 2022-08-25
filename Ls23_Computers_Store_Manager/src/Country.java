
public class Country {
	private String countryId;
	private String nameOfCountry;
	public Country(String countryId, String nameOfCountry) {

		this.countryId = countryId;
		this.nameOfCountry = nameOfCountry;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getNameOfCountry() {
		return nameOfCountry;
	}
	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: " + this.countryId + " - " + "Country: " + this.nameOfCountry;
	}
	
	
}
