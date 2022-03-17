package org.techouts;

public class NestedIf {

	public static void main(String[] args) {
		int x =100, y=300;
		if (x==100) {
			System.out.println("100");
		}if (y==300) {
			System.out.println("300");
		}else if (y != 300) {
			System.out.println(y);
		}else {
			System.out.println("All are done");
		}
	}
}

