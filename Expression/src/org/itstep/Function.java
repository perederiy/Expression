package org.itstep;

public class Function {
	
	public int x = 2;
	
	public int getFunction() {
		Factorial factorial = new Factorial();
		int result =(x + 2)*factorial.getFactorial(x);
		return result;
	}
}
