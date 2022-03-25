package org.oopsconcepts;
class Emp{
	int eid;
	int salary;
	static String ceo;//static variable is declared
	static {
		ceo="larrt";
	}
	public Emp() {
		eid = 1000;
		salary = 120;
	}
	public void show() {
	System.out.println(eid+":"+salary+":"+ceo);
}
}

public class StaticKeyword {

	public static void main(String[] args) {
		Emp pavan = new Emp();
		pavan.eid = 18698;
		pavan.salary=456;
		Emp.ceo= "Sahrma";
		pavan.show();

	}

}
