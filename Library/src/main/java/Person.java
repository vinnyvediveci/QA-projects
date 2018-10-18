import java.util.ArrayList;

public class Person extends Library {
	static ArrayList<Person> peopleArray = new ArrayList<Person>();
	private int ID;
	private String name;
	private static int counter = 0;

	public Person(String name) {
		this.ID = counter;
		counter++;
		this.setName(name);
	}

	public void setArrayList(ArrayList<Person> peopleArray) {
		Person.peopleArray = peopleArray;
	}

	public ArrayList<Person> getPeopleList() {
		return peopleArray;
	}

	public static void addPerson(Person person) {
		peopleArray.add(person);
	}

	public void removePerson(Person person) {
		peopleArray.remove(person);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}
