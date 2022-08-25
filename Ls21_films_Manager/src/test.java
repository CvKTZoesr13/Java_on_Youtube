
public class test {
	public static void main(String[] args) {
		premiereDay day1 = new premiereDay(12, 4, 2020);
		premiereDay day2 = new premiereDay(19, 7, 2021);
		premiereDay day3 = new premiereDay(30, 4, 2022);

		Manufacturer fac1 = new Manufacturer("Marvel Studio", "USA");
		Manufacturer fac2 = new Manufacturer("Sony Studio", "UK");
		Manufacturer fac3 = new Manufacturer("DC Studio", "VN");

		Films film1 = new Films("Doctor Strange 2", 2022, fac1, 210000, day1);
		Films film2 = new Films("Dead or Alive", 2021, fac2, 180000, day2);
		Films film3 = new Films("Neten", 2022, fac3, 120000, day3);

		System.out.println(film1.getNameOfFilms());
		System.out.println(film2.getNameOfFilms());
		System.out.println(film3.getNameOfFilms());
		System.out.println("Is " + film1.getNameOfFilms() + "'s price of ticket cheaper than " + film2.getNameOfFilms()
				+ ": " + film1.checkPriceCheaper(film2));
		System.out.println(film1.getNameOfManufacturer());
		System.out.println(film2.getNameOfManufacturer());
		System.out.println(film3.getNameOfManufacturer());
		System.out.println("Sale off 10% price of ticket: " + film1.getPriceOfTicket()+" " + "-> " +film1.saleOff(10));
	}
}
