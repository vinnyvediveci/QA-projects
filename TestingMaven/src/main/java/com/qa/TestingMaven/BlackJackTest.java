package com.qa.TestingMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackTest {
	BlackJack bla = new BlackJack();
	 @Test
	public void testGame() {
  assertEquals(0, bla.playBlackJack(34, 67));
        assertEquals(4, bla.playBlackJack(4, 67));
     assertEquals(5, bla.playBlackJack(34, 5));
        assertEquals(21, bla.playBlackJack(21, 67));
     assertEquals(21, bla.playBlackJack(21, 21));
}
}