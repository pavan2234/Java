package org.techouts;

public class Shifter {

	public static void main(String[] args) {
		int number = 2,number1 = -2;
		System.out.println(number << 2);//{number*2^2}
		System.out.println(number >> 2);//{number/2^2}
		System.out.println(number >>> 2);//for positive values both are same
		//System.out.println(number1 <<< 2);
	}

}
