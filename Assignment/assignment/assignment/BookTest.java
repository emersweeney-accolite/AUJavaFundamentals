package assignment;

public class BookTest {

	public static void main(String[] args) {
		Book testBook = new Book(1, "Strange Weather In Tokyo", 7.99f);
		Book testSpecialBook = new SpecialEditionBook(2, "Before The Coffee Gets Cold", 7.99f, 2.49f);
		
		testBook.display();
		testSpecialBook.display();
	}
}
