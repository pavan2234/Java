package org.oopsconcepts;
class operation{
	int square(int n) {
		return n*n;
	}
}

public class Aggregation {
	operation op;//Agregation
	double pi =3.14;
	double area(int radius) {
		op=new operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}

	public static void main(String[] args) {
		Aggregation c= new Aggregation();
		double result =c.area(5);
		System.out.println(result);
		

	}

}
