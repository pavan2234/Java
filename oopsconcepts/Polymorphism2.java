package org.oopsconcepts;
class Shapes{
	public void Area() {
	System.out.println("The formula for Area is");
}
}
class Circle extends Shapes{
	public void Area() {
		System.out.println("The Area of circle is 3.14*r*r ");
	}
}
class Triangle extends Shapes{
	public void Area() {
		System.out.println("Area of trianglr is 1/2*base*height");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		Shapes myShapes = new Shapes();
		Shapes myCircle = new Circle();
		Shapes myTriangle = new Triangle();
		myShapes.Area();
		myCircle.Area();
		myTriangle.Area();

	}

}
