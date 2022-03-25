package org.oopsconcepts;

public class Test2 {
	public void m1(String s) {
		System.out.println("String Version");
	}

	public void m1(Object o) {
		System.out.println("Object Version");
	}

	public static void main(String arg[]) {
		Test2 t = new Test2();
		t.m1("raju"); // -> String Version
		t.m1(new Object());// -> Object Version
		t.m1(null);
	}
}
