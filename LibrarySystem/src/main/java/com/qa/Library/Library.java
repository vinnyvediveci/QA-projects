package com.qa.Library;

import java.util.ArrayList;



public class Library {
	  static String ItemId;
	  int Pages;
	  boolean checkIn;
	  boolean inLibrary;
	  boolean personInLibrary;
	  
	 public Library() {
		 ArrayList<Library> libraryFile = new ArrayList<Library>();
		
	 }
	  
	 public static void addToLibrary(Object obj) {
		 libraryFile.add(obj);
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
