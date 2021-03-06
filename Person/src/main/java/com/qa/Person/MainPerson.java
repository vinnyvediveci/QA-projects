package com.qa.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPerson {
	 public static void main(String[] args) {
		 
		 Person p1 = new Person("John", 23, "Pilot");
		 Person p2 = new Person("Tom", 36, "Engineer");
		 Person p3 = new Person("James", 45, "Stalker");
	     System.out.println(p1.toString());
		 System.out.println(p1.getName());
		 System.out.println(p2.getName());
		 System.out.println(p3.getName());
		 
		 
		 ArrayList <Person> listOfPeople = new ArrayList<Person>();
		List<Person> allPeople = Arrays.asList(p1, p2, p3);
		System.out.println(allPeople);
		listOfPeople.add(p1);
		listOfPeople.add(p2);
		System.out.print(searchName(allPeople, "John"));
		 
		
		
	 }
	 public static List<Person> searchName(List<Person> allPeople, String name) {
    	
		return allPeople.stream().filter(n -> n.getName() == name).collect(Collectors.toList());
    }
}
