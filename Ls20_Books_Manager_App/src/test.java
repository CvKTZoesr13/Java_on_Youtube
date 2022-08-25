
public class test {
	public static void main(String[] args) {
		Date ngay1 = new Date(12, 05, 2002);
		
		Author author1 = new Author("J.K.Rowling", ngay1);
		Author author2 = new Author("Robert Kiyosaki", ngay1);
		Book book1 = new Book("Harry Potter", 56000, 2020, author1);
		Book book2 = new Book("Rich dad, poor dad", 40000, 2013, author2);
		System.out.println(ngay1);
		System.out.println(author1);
		System.out.println(book1);
		book1.printNameOfBook();
		System.out.println(book1.checkYearOfPublication(book2));;
		System.out.println(book1.saleOff(10));
		
	}
}
