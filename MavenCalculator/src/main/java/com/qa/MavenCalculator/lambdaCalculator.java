package com.qa.MavenCalculator;




public class lambdaCalculator {
	public static void main(String[] args) {
		MathOperation addition = ( a, b) -> a + b; 
		MathOperation subtraction = ( a, b) -> a - b;
		MathOperation multiplication = ( a, b) -> a * b;
		MathOperation division = ( a, b) -> a / b;

		
		System.out.println(calculator(division, 135,134));
	}
	
	
	

	public static double calculator(MathOperation op, double a, double b) {
		return op.operate(a, b);
	}
	
}
