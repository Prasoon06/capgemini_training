package simpletreesetdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class BookTest {

	public static void main(String[] args) {
		new BookTest().start();

	}

	private void start() {
		TreeSet<Book> treeSet = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				
				return b1.getTitle().compareTo(b2.getTitle());
			}
		});
		Book book1 = new Book("How Java Works");
		Book book2 = new Book("Advance Java J2EE");
		Book book3 = new Book("Ordinary to Extra Ordinary");
		treeSet.add(book1);
		treeSet.add(book2);
		treeSet.add(book3);
		System.out.println(treeSet);
		
	}

}
