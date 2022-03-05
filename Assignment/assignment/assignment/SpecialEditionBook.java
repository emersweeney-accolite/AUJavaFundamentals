package assignment;

public class SpecialEditionBook extends Book{
	private float discount;
	
	public SpecialEditionBook(int bno, String bname, float price, float discount) {
		super(bno, bname, price);
		this.discount = discount;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Special price: £" + (price - discount));
	}
}
