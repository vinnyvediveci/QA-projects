
public class Book extends LibraryItem{
	private String genre;
     public Book(String title, String genre) {
    	 super (title);
    	 this.genre= genre;
     }
     
  public String toString() {
	return this.getTitle() + " " + this.getGenre();
	  
  }

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}
	 
}
