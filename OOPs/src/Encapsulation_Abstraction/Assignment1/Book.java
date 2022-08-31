package Encapsulation_Abstraction.Assignment1;

public class Book {
	private String name;
	private Author author;
	private Double price;
	private int qtyInStock;
	public Book(String name, Author author, Double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
		
		
	}
	

}
