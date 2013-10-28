package com.bm;

public class StwAndo {

	/**
	 * @param args Not used
	 */
	public static void main(String[] args) {
		boolean isMultiple;
		StringBuffer stringBuffer = new StringBuffer();
		String endLine = System.getProperty("line.separator");
		for (int i = 1; i <= 100; ++i) {
			isMultiple = false;
			if(i % 3 == 0){
				stringBuffer.append("Stw");
				isMultiple = true;
			}
			if(i % 5 == 0){
				stringBuffer.append("Ando");
				isMultiple = true;
			}
			if(isMultiple){
				stringBuffer.append(endLine);
			} else {
				stringBuffer.append(i + endLine);
			}
		}
		System.out.print(stringBuffer);
	}
}
