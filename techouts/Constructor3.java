package org.techouts;

public class Constructor3 {
	Constructor3() {
		this(10);
		System.out.println("No-arg constructor");
		}
		Constructor3(int i) {
		this(10.5);
		System.out.println("int-arg");
		}
		Constructor3(double d) {
		System.out.println("double-arg");
		}

public static void main(String[] args) {
	Constructor3 t1 = new Constructor3(1);
	Constructor3 t2 = new Constructor3(10);
	Constructor3 t3 = new Constructor3(20.5);
	Constructor3 t4 = new Constructor3('a');
	Constructor3 t5 = new Constructor3(10l);
}
}