package org.techouts;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter the Value");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		do {
			System.out.println("The value is " + x);
			x++;
			} while(x<20);
		

	}

}
