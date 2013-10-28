package com.bm;

public class Fib {

	/**
	 * @param args Not used
	 */
	public static void main(String[] args) {
		printFibNumber(10);
	}
	
	
	/**
	 * @param nbFirstNumber Number of element that should be print.
	 * 
	 * This function is not recursive because the operation is simple.<br> 
	 * The use of a recursive function would've add lot of stack overhead.<br>
	 * Also being inside of a single context allow to use a unique string buffer without additional parameter. 
	 */
	public static void printFibNumber(int nbFirstNumber){
		//By Fibonacci definition the first 2 number are 0 and 1.
		int previousNumber = 0;
		int currentNumber = previousNumber;
		int nextNumber = 1;

		StringBuffer stringBuffer = new StringBuffer();
		String endLine = System.getProperty("line.separator");
		stringBuffer.append(previousNumber + endLine);

		//Start at 1 because the first number is already printed.
		for (int i = 1; i < nbFirstNumber; ++i) {
			stringBuffer.append(nextNumber + endLine);
			currentNumber = nextNumber;
			nextNumber += previousNumber;
			previousNumber = currentNumber;
		}
		System.out.print(stringBuffer);
	}
}
