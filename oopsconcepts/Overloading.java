package org.oopsconcepts;

public class Overloading {
	public void m1() {
		System.out.println("no-args");
	}

	public void m1(int i) {
		System.out.println("int-args");
	}

	public void m1(float f) {
		System.out.println("float-args");
	}
	public void m1(double d) {
		System.out.println("double-args");
	}

	public static void main(String[] args) {
		Overloading t = new Overloading();
		t.m1();
		t.m1(10);
		t.m1(10l);
		t.m1(10f);
		t.m1('a');
		t.m1(10.2);
	}
	}