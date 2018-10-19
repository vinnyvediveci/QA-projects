package com.qa.Library;

import java.util.ArrayList;



public class Library {
	  static String ItemId;
	  int Pages;
	  boolean checkIn;
	  boolean inLibrary;
	  boolean personInLibrary;
	  ArrayList<Library> libraryFile = new ArrayList<Library>();
	 public Library() {
		
		
	 }
	  
	 public void addToLibrary(Object obj) {
		 libraryFile.add((Library) obj);
	 }
	 public static boolean checkingItemIn(boolean checkIn) {
		 return true;
	 }
	  public static ArrayList<Library> libraryToFile() {
		return null;
		  
	  }
	  
	  public static ArrayList<Library> fileTOLibrary() {
		return null;
		  
	  }
	
}
