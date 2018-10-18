
public class Dissertation extends LibraryItem{
     private String author;
	public Dissertation(String title, String author) {
		super(title);
	   	 this.setAuthor(author);
    }
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override 
	public String toString() {
		return this.getTitle() + " " + this.getAuthor();
	}
}
