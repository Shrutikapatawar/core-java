package oops.enapsulation;

public class Book1 {
	public static void main(String[] args) {
		Book b = new Book();
		b.setBookId(201);
		b.setTitle("It Ends with Us");
		b.setAuthor("Colleen Hoover");
		b.setPrice(500);
		System.out.println(b.getBookId());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
	}
}
