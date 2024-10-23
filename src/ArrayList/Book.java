package ArrayList;
import java.util.ArrayList;
public class Book {
	String name;
	double price;
	String author;
	int bid;
	public Book(String name, double price, String author, int bid) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", bid=" + bid + "/n]";
	}

}
