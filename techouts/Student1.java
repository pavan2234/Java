package org.techouts;

public class Student1 {
	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  
	}  
	class TestStudent4{  
	 // doubt
	public static void Student1(String[] args) {
		 Student1 s1=new Student1();  
		  Student1 s2=new Student1();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  	

	}

}
