package org.techouts;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (x<20) {
			System.out.println("Value of x is " + x);
			x++; 
		}

	}

}
