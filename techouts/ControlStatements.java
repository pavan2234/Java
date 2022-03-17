package org.techouts;
import java.util.Scanner;
public class ControlStatements {

	public static void main(String[] args) {
		System.out.println("Enter an integer:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
		System.out.println("The number is positive");
		} else {
		System.out.println("The number is negative");
		}

	}

}
