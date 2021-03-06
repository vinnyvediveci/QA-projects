package com.qa.LibrarySystem;

public class Dissertations extends LibraryItems{
	private static String itemId;
	private String title;
	private boolean checkedIn;
	private boolean inLibrary;
	
	
	public Dissertations(String itemId, String title, boolean checkedIn, boolean inLibrary) {
		Dissertations.itemId = itemId;
		this.title = title;
		this.checkedIn = checkedIn;
		this.inLibrary = inLibrary;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		Dissertations.itemId = itemId;
	}

	public String getPages() {
		return title;
	}

	public void setPages(String pages) {
		this.title = title;
	}

	public boolean isInLibrary() {
		return inLibrary;
	}

	public void setInLibrary(boolean inLibrary) {
		this.inLibrary = inLibrary;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
 

}
