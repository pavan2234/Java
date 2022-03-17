package org.techouts;

public class ConstructorEx {
	int num;
	String name;
	ConstructorEx() { System.out.println("Constructor called"); }
	public static void main(String[] args) {
		ConstructorEx c1= new ConstructorEx();
		System.out.println(c1.name);
		System.out.println(c1.num);

	}

}
