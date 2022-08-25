
public class Book {
	private String nameOfBook;
	private double price;
	private int yearOfPublication;
	private Author author;

	public Book(String nameOfBook, double price, int yearOfPublication, Author author) {

		this.nameOfBook = nameOfBook;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.author = author;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void printNameOfBook() {
		System.out.println("Name of this book: " + this.nameOfBook);
	}

	public boolean checkYearOfPublication(Book other) {
//		if (this.yearOfPublication == other.yearOfPublication)
//			return true;
//		return false;
		return this.yearOfPublication == other.yearOfPublication;
	}
	
	public double saleOff(double x) {
		return this.price*(1 - x/100);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameOfBook + "\n" + this.price + "\n" + this.yearOfPublication + "\n" + this.author;
	}

}
