package org.oopsconcepts;
class student{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation2 {
	public static void main(String [] args)
	{
		student s1 = new student();
		s1.setName("pavan");
		s1.setRollno(18610408);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
	}

}
