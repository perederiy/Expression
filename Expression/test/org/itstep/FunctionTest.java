package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void testGetFunction() {
		Function function = new Function();
		int result = function.getFunction();
		assertEquals(8, result);
		assertFalse(result == 7);
		assertFalse(result == 9);
		assertTrue(result != 3);
		assertNotEquals(7, result);
	}

}
