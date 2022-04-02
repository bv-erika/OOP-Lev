package products;

public class Book extends Product {

	private String author;
	private String title;
	private int year;
	private int pages;
	
	public Book(String name, int taxrate, String author, String title, int year, int pages) {
		super(name, taxrate);
		this.author = author;
		this.title = title;
		this.year = year;
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", year=" + year + ", pages=" + pages + ", toString()="
				+ super.toString() + "]";
	}

}
