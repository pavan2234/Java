package org.oopsconcepts;
class Shapes3 {
	  public void area() {
	    System.out.println("The formula for area of ");
	  }
	}
	class Triangle1 extends Shapes3 {
	  public void area() {
	    System.out.println("Triangle is ½ * base * height ");
	  }
	}
	class Circle2 extends Shapes3 {
	  public void area() {
	    System.out.println("Circle is 3.14 * radius * radius ");
	  }
	}
	class PolymorphismTask {
	  public static void main(String[] args) {
	    Shapes3 myShape = new Shapes3();  // Create a Shapes object
	    Shapes3 myTriangle = new Triangle1();  // Create a Triangle object
	    Shapes3 myCircle = new Circle2();  // Create a Circle object
	    myShape.area();
	    myTriangle.area();
	    myShape.area();
	    myCircle.area();
	  }
	}
