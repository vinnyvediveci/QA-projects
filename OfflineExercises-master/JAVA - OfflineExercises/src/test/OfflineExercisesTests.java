package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.OfflineExercises;

public class OfflineExercisesTests {
	/*
	 * README Do not edit tests, the trainer will be running your code against a
	 * copy of the current tests here So if you edit the tests here, the changes
	 * will not reflect in the trainers version of the tests, and may result in some
	 * tests failing.
	 */
	OfflineExercises oe = new OfflineExercises();

	@Test
	public void multChar() {
		assertEquals("TTThhheee", oe.multChar("The"));
		assertEquals("AAAAAAbbbbbb", oe.multChar("AAbb"));
		assertEquals("HHHiii---TTThhheeerrreee", oe.multChar("Hi-There"));
	}

	@Test
	public void getBert() {
		assertEquals("evilc", oe.getBert("bertclivebert"));
		assertEquals("egdirf", oe.getBert("xxbertfridgebertyy"));
		assertEquals("egdirf", oe.getBert("xxBertfridgebERtyy"));
		assertEquals("", oe.getBert("xxbertyy"));
		assertEquals("", oe.getBert("xxbeRTyy"));
	}

	@Test
	public void evenlySpaced() {
		assertTrue(oe.evenlySpaced(2, 4, 6));
		assertTrue(oe.evenlySpaced(4, 6, 2));
		assertFalse(oe.evenlySpaced(4, 6, 3));
		assertFalse(oe.evenlySpaced(4, 60, 9));
	}

	@Test
	public void nTwice() {
		assertEquals("Helo", oe.nTwice("Hello", 2));
		assertEquals("Choate", oe.nTwice("Chocolate", 3));
		assertEquals("Ce", oe.nTwice("Chocolate", 1));
	}

	@Test
	public void endsDev() {
		assertTrue(oe.endsDev("cooldev"));
		assertTrue(oe.endsDev("endsDev"));
		assertFalse(oe.endsDev("jh"));
		assertFalse(oe.endsDev("coolev"));
		assertFalse(oe.endsDev("oddowiyhy"));
	}

	
	@Test
	public void superBlockTest() {
		assertEquals(2, oe.superBlock("hoopplla"));
		assertEquals(3, oe.superBlock("abbCCCddDDDeeEEE"));
		assertEquals(0, oe.superBlock(""));
	}
	
	@Test
	public void amISearchTest() {
		assertEquals(1, oe.amISearch("Am I in Amsterdam"));
		assertEquals(2, oe.amISearch("I am in Amsterdam am I?"));
		assertEquals(0, oe.amISearch("I have been in Amsterdam"));
		assertEquals(5, oe.amISearch("am am am amamam am am amuyg"));
		
	}
	
	@Test
	public void fizzBuzzTest() {
		
		assertEquals("fizz", oe.fizzBuzz(9));
		assertEquals("buzz", oe.fizzBuzz(10));
		assertEquals("fizzbuzz", oe.fizzBuzz(30));
		assertEquals("fizzbuzz", oe.fizzBuzz(3000));
		
	}
	
	@Test
	public void largestTest() {
		
		assertEquals(14,oe.largest("55 72 86"));
		assertEquals(11,oe.largest("15 72 80 164"));
		assertEquals(15,oe.largest("555 72 86 45 10"));
		
	}

}
