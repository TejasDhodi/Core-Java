package Methods;

class Book {
	public void buyBook(int cost) {
		if(cost < 99) {
			System.out.println("You are not eligible to buy a book");
		} else {
			System.out.println("You Can Buy A Book");
		}
	}
}

public class SellBook {

	public static void main(String[] args) {
		Book bk = new Book();
		
		bk.buyBook(99);

	}

}
