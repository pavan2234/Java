package org.oopsconcepts;

class Vehicle{  
	  //defining a method  
	  void run(){System.out.println("Vehicle is moving");}  
	}  
	//Creating a child class  
	class Car2Overriding extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("car is running safely");}  
	  
	  public static void main(String args[]){  
	  Car2Overriding obj = new Car2Overriding();//creating object  
	  obj.run();//calling method  
	  }  
	}