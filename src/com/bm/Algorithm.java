package com.bm;

public class Algorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();
		if(args.length > 0){
			try {
				int number = Integer.parseInt(args[0]);
				algorithm.printNumber(number);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				algorithm.printNumber(0);
				algorithm.printNumber(1);
				algorithm.printNumber(9);
				algorithm.printNumber(12);
				algorithm.printNumber(19);
				algorithm.printNumber(20);
				algorithm.printNumber(25);
				algorithm.printNumber(44);
				algorithm.printNumber(99);
				algorithm.printNumber(100);
				algorithm.printNumber(110);
				algorithm.printNumber(190);
				algorithm.printNumber(200);
				algorithm.printNumber(222);
				algorithm.printNumber(350);
				algorithm.printNumber(600);
				algorithm.printNumber(1000);
				algorithm.printNumber(1001);
				algorithm.printNumber(1600);
				algorithm.printNumber(1999);
				algorithm.printNumber(3000);
				algorithm.printNumber(30000);
				algorithm.printNumber(30100);
				algorithm.printNumber(30101);
				algorithm.printNumber(100000);
				algorithm.printNumber(101000);
				algorithm.printNumber(101101);
				algorithm.printNumber(101110);
				algorithm.printNumber(115115);
				algorithm.printNumber(140000);
				algorithm.printNumber(140999);
				algorithm.printNumber(222222);
				algorithm.printNumber(999999);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public void printNumber(int numberToPrint) throws Exception{
		if (numberToPrint < 0 && numberToPrint > 999999){
			throw new Exception("Number outside of the supported range. (Between 0 and 999,999)");
		}
		StringBuffer stringBuffer = new StringBuffer();
		if(numberToPrint == 0){
			stringBuffer.append("zero");
			System.out.println(stringBuffer);
			return;
		}
		int thousandPart = numberToPrint / 1000;
		int hundredPart = numberToPrint % 1000;
		if(thousandPart > 0){
			printNumberLessThousand(thousandPart, stringBuffer);
			stringBuffer.append(" thousand");
			if(hundredPart > 0){
				stringBuffer.append(", ");
			}
		}
		if(hundredPart > 0){
			printNumberLessThousand(hundredPart, stringBuffer);
		}
		System.out.println(stringBuffer);
	}

	private void printNumberLessThousand(int number, StringBuffer stringBuffer) throws Exception{

		int hundredPart = number / 100;
		if(hundredPart > 0){
			printHundredPart(hundredPart, stringBuffer);
		}
		int smallPart = number % 100;
		if(smallPart > 0){
			if(stringBuffer.length() > 0 && hundredPart > 0){
				stringBuffer.append(" ");
			}
			printNumberLessHundred(smallPart, stringBuffer);
		}
	}
	
	private void printHundredPart(int number, StringBuffer stringBuffer) throws Exception{
		printNumberLessTwenty(number, stringBuffer);
		stringBuffer.append(" hundred");
		
	}
	
	private void printNumberLessHundred(int number, StringBuffer stringBuffer) throws Exception{
		if(number < 20){
			printNumberLessTwenty(number, stringBuffer);
		} else {
			int tensPart = number / 10;
			printTensPart(tensPart, stringBuffer);			
			int unitPart = number - (tensPart * 10);
			if(unitPart > 0){
				stringBuffer.append("-"); //Can be replace by " " to be closer to spec
				printNumberLessTwenty(unitPart, stringBuffer);
			}
		}
	}
	
	private void printTensPart(int number, StringBuffer stringBuffer) throws Exception{
		switch (number) {
		case 2:
			stringBuffer.append("twenty");
			break;
			
		case 3:
			stringBuffer.append("thirty");
			break;

		case 4:
			stringBuffer.append("forty");
			break;

		case 5:
			stringBuffer.append("fifty");
			break;

		case 6:
			stringBuffer.append("sixty");
			break;

		case 7:
			stringBuffer.append("seventy");
			break;

		case 8:
			stringBuffer.append("eighty");
			break;

		case 9:
			stringBuffer.append("ninety");
			break;
		default:
			throw new Exception("Number not supported by this function: (" + number + ")");
		}
	}
	
	private void printNumberLessTwenty(int number, StringBuffer stringBuffer) throws Exception{
		switch (number) {
		case 0:
			break;

		case 1:
			stringBuffer.append("one");
			break;

		case 2:
			stringBuffer.append("two");
			break;

		case 3:
			stringBuffer.append("three");
			break;

		case 4:
			stringBuffer.append("four");
			break;

		case 5:
			stringBuffer.append("five");
			break;

		case 6:
			stringBuffer.append("six");
			break;

		case 7:
			stringBuffer.append("seven");
			break;

		case 8:
			stringBuffer.append("eight");
			break;

		case 9:
			stringBuffer.append("nine");
			break;

		case 10:
			stringBuffer.append("ten");
			break;

		case 11:
			stringBuffer.append("eleven");
			break;

		case 12:
			stringBuffer.append("twelve");
			break;

		case 13:
			stringBuffer.append("thirteen");
			break;

		case 14:
			stringBuffer.append("fourteen");
			break;

		case 15:
			stringBuffer.append("fifteen");
			break;

		case 16:
			stringBuffer.append("sixteen");
			break;

		case 17:
			stringBuffer.append("seventeen");
			break;

		case 18:
			stringBuffer.append("eighteen");
			break;

		case 19:
			stringBuffer.append("nineteen");
			break;
			
		default:
			throw new Exception("Number not supported by this function: (" + number + ")");
		}
	}

}
