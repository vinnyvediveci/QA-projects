package com.qa.findOperatorOfCalculator;

public class Calculator {
  
	
	 public static void findOperator(int x, int y, int z) {
		 if (x * y == z) {
			System.out.println(Integer.toString(x) + " x " + Integer.toString(y) + " = " + Integer.toString(z));
		 } else if (x / y == z) {
			 System.out.println(Integer.toString(x) + " / " + Integer.toString(y) + " = " + Integer.toString(z));
		 } else if (x + y == z) {
			 System.out.println(Integer.toString(x) + " + " + Integer.toString(y) + " = " + Integer.toString(z));
		 } else if (x - y == z) {
			 System.out.println(Integer.toString(x) + " - " + Integer.toString(y) + " = " + Integer.toString(z));
		 } 
	
	 }
	 
	 public static void calculatetwo(int x, int y ) {
//		 if (x * y) {
//				return x * y;
//			 } else if (x / y == z) {
//				 r;
//			 } else if (x + y == z) {
//				 System.out.println(Integer.toString(x) + " + " + Integer.toString(y) + " = " + Integer.toString(z));
//			 } else if (x - y == z) {
//				 System.out.println(Integer.toString(x) + " - " + Integer.toString(y) + " = " + Integer.toString(z));
//			 } 
		
	 }
	 public static void diffCombinationsThree(int x, int y, int z) {
		 findOperator(x, y, z);
		 System.out.println("-----");
		 findOperator(x, z, y);
		 System.out.println("-----");
		 findOperator(y, z, x);
		 System.out.println("-----");
		 findOperator(y, z, x);
		 System.out.println("-----");
		 findOperator(z, x, y);
		 System.out.println("-----");
		 findOperator(z, y, x);
		 System.out.println("-----");
	 }
	
	 public static void diffCombinationsFour(int w, int x, int y, int z) {
		 
	 }
	
	
	
}
