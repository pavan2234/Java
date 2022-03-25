package org.oopsconcepts;
class Calculator{
	public int add(int i,int j) {
		return i+j;
	}
	
}
class CalAdv extends Calculator{
	public int sub(int i,int j) {
		return i-j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		CalAdv c1 = new CalAdv();
		int result1 = c1.add(5, 6);
		int result2 = c1.sub(12, 6);
		System.out.println(result1);
		System.out.println(result2);

	}

}
