package com.qa.TestingMaven;

public class BlackJack {
	
  public int playBlackJack(int a, int b) {
	 if ( a > 21 && b > 21) {
		 return 0;
	 } else if (a > 21 && b <= 21) {
		 return b;
	 } else if(a <= 21 && b <= 21) {
		 return Math.max(a, b);
	 } else if (a <= 21 && b > 21) {
		 return a;
	 } 
	return 0;
	
 }
}
