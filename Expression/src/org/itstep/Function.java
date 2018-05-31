package org.itstep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Function {

	Number number = new Number();

	public int getFunction() {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		boolean swit = true;
		do {
			System.out.println("Enter number from 1 to 11: ");
			System.out.println("If you want to exit push 0");
				number.setNumber(scanner.nextInt());
				if (number.getNumber() > 0 && number.getNumber() <= 11) {
					result = (number.getNumber() + 2) * getFactorial(number.getNumber());
					System.out.println("This expression is:" + result + "\n");
				} else if (number.getNumber() == 0) {
					swit = false;
					System.out.println("You exit from program");
				} else {
					System.out.println("Enter correct number");
				}
		} while (swit);

		return result;
	}

	private int getFactorial(int x) {
		int result = 1;
		for (int i = 2; i <= x; i++) {
			result = result * i;
		}
		return result;
	}
}
