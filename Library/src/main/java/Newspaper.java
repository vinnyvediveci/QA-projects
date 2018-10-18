
public class Newspaper extends LibraryItem {
	
	private int circulation;
	public Newspaper(String title, int circulation) {
   	 super(title);
   	 this.setCirculation(circulation);
    }
	public int getCirculation() {
		return circulation;
	}
	public void setCirculation(int circulation) {
		this.circulation = circulation;
	}
	
	
	@Override
	public String toString() {
		return this.getTitle() + " " + this.getCirculation();
	}
	
	

	
	
}
