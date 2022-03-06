package assignment;

public class Book {
	protected int bno;
	protected String bname;
	protected float price;
	
	public Book(int bno, String bname, float price) {
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Book Name: " + bname
				+ "\nBook Number: " + bno +
				"\nBook Price: £" + price);
	}
}
