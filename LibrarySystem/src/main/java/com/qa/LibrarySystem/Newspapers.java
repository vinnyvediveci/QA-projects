package com.qa.LibrarySystem;

public class Newspapers extends LibraryItems{
	private static String itemId;
	private int pages;
	private boolean checkedIn;
	private boolean inLibrary;
	
	public Newspapers(String itemId, int pages, boolean checkedIn, boolean inLibrary) {
		Newspapers.itemId = itemId;
		this.pages = pages;
		this.checkedIn = checkedIn;
		this.inLibrary = inLibrary;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		Newspapers.itemId = itemId;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
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
