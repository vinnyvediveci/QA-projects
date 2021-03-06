package com.qa.LibrarySystem;

public class Books extends LibraryItems{
	
	private static String itemId;
	private String title;
	private boolean checkedIn;
	private boolean inLibrary;

	public Books(String itemId, String title, boolean checkedIn, boolean inLibrary) {
		Books.itemId = itemId;
		this.title = title;
		this.checkedIn = checkedIn;
		this.inLibrary = inLibrary;
	}
 
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		Books.itemId = itemId;
	}

	public String getPages() {
		return title;
	}

	public void setPages(String title) {
		this.title = title;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public boolean isInLibrary() {
		return inLibrary;
	}

	public void setInLibrary(boolean inLibrary) {
		this.inLibrary = inLibrary;
	}
}
