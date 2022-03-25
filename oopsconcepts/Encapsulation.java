package org.oopsconcepts;
class Student12{  
	//private data member  
	private String name;  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name;  
	}  
	}  
public class Encapsulation { 
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student12 s=new Student12();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}  