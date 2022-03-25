package org.oopsconcepts;
class A{
	public A(){
		System.out.println("A");
	}
	public A(int i) {
		System.out.println("int A");
	}
}
class B extends A{
	public B(){
		super();
		System.out.println("B");
	}
	public B(int i) {
		super();
		System.out.println("int B");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		B obj1 = new B(5);

	}

}
