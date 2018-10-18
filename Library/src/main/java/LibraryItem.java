
public abstract class LibraryItem extends Library {

	private static int counter = 0;
	private int itemID;

	private String title;

	public LibraryItem(String title) {
		this.title = title;
		this.itemID = counter;
		counter++;
     }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;

	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
}
