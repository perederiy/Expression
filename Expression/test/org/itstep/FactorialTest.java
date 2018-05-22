package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testGetFactorial() {
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(3);
		assertEquals(6, result);
	}

}
