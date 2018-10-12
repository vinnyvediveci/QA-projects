package com.qa.Person;

/**
 * Hello world!
 *
 */
public class Person 
{
   
       public String name;
       private int age;
       private String jobTitle;
    
       public void setName(String name) {
    	   this.name = name;
 }
       public String getName() {
    	   return this.name;
       }
       
       public void setAge(int age) {
    	   this.age = age;
       }
       
       public int getAge() {
    	  return this.age;
       }
       
       public void setJobTitle(String jobTitle) {
    	   this.jobTitle = jobTitle;
       }
       
       public String getJobTitle() {
    	   return this.jobTitle;
       }
       
       @Override
       public String toString() {
		
    	   return this.name + " " + this.age + " " + this.jobTitle;
    	
       }
  
       public Person(String name, int age, String jobTitle) {
    	   this.name = name;
    	   this.age = age;
           this.jobTitle = jobTitle;
       }
}
