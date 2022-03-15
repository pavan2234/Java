package org.techouts;

public class UnaryOperator {

	public static void main(String[] args) {
		int number = 20;
		System.out.println(number++);
		System.out.println(number--);
		System.out.println(++number);
		System.out.println(--number);
		System.out.println(number++ + ++number);
		System.out.println(number++ + number++);
		int number1=20;
		int number2= -10;
		boolean number3= true;
		boolean number4= false;
		System.out.println(~number1);
		System.out.println(~number2);
		System.out.println(!number3);
		System.out.println(!number4);
		int n1=20;
		int n2= 10;
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1%n2);
		System.out.println(n1/n2);

	}

}
