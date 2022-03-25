package org.oopsconcepts;
	abstract class Shape{  
		abstract void draw();  
	}   
	class Rectangle extends Shape{  
		void draw(){System.out.println("drawing rectangle");}  
	}  
	class Circle1 extends Shape{  
		void draw(){System.out.println("drawing circle");}  
	}    
	public class Abstraction {

	public static void main(String[] args) {
		Shape s=new Circle1();
		Shape r=new Rectangle();
		s.draw();
		r.draw();

	}

}
