package listdemo;

public class Song{
	
	private String title;
	private String author;
	private String rating;
	private String year;
	public Song(String title, String author, String rating, String year) {
		super();
		this.title = title;
		this.author = author;
		this.rating = rating;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getRating() {
		return rating;
	}
	public String getYear() {
		return year;
	}
	
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", author=" + author + ", rating=" + rating + ", year=" + year + "]";
	}
	

}
