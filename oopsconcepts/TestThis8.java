package org.oopsconcepts;
class NewStudent{  
	int rollno;  
	String name;  
	float fee;  
	NewStudent(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){
	System.out.println(rollno+" "+name+" "+fee);
	}  
}  
class TestThis8{  
public static void main(String args[]){  
NewStudent s1=new NewStudent(111,"ankit",5000f);  
NewStudent s2=new NewStudent(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
