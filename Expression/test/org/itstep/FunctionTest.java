package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void testGetFunction() {
		Function function = new Function();
		int result = function.getFunction();
		assertEquals(8, result);
	}

}
