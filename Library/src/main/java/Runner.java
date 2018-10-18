
public class Runner {
public static void main(String[] args) {
	
	Person p1 = new Person("Joseph");
	Person p2 = new Person( "Jon");
	Person.addPerson(p1);
	System.out.println(p1.getID());
	System.out.println(p2.getID());
	Library l1 = new Library();
	Book b1 = new Book("Eragon", "Fantasy");
	Newspaper n1 = new Newspaper("Guardian", 20000);
	Dissertation d1 = new Dissertation("Properties of expanding universes", "Stephen Hawking");
	l1.addOrCheckinToLibrary(b1);
	l1.addOrCheckinToLibrary(n1);
	l1.addOrCheckinToLibrary(d1);
	System.out.println();
	System.out.println(l1.getLibrary());
	
	
	
//	System.out.println(l1.getLibrary().get());
//	System.out.println(l1.getLibrary().get());
}
}
