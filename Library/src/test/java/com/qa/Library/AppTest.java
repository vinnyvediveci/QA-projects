package com.qa.Library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
    @test
    public void testreturnLibrary()
    {
	
	
        assertNotNull(l1.getLibrary());
    }
}
