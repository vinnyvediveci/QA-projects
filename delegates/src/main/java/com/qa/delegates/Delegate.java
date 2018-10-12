package com.qa.delegates;

/**
 * Hello world!
 *
 *
 */
public class Delegate 
{
    
       
       public int techSkills;
       private int softSkills;
       public String name; 
       
       public void remove() {
    	   System.out.print("Delegate was removed");
       
    }
       
       public void changeStream() {
    	   System.out.println("delegate changed stream");
       }
       
       public Delegate(String name, int softSkills, int techSkills) {
    	   
    	   this.name = name;
    	   this.softSkills = softSkills;
    	   this.techSkills = techSkills;
       }
}
