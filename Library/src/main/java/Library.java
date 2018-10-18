import java.util.ArrayList;

public class Library {
	public Library() {}
    private ArrayList<LibraryItem> LibraryList = new ArrayList<LibraryItem>();
    
    
   

 public void addOrCheckinToLibrary(LibraryItem Li) {
	 LibraryList.add(Li);
 }
  
 public void removeOrCheckoutFromLibrary(LibraryItem Li) {
	 LibraryList.remove(Li);
 }
 

 public ArrayList<LibraryItem> getLibrary() {
	 return LibraryList;
 }
 
 

}
