package org.techouts;

public class Constr {
	int num;
	String name;
	Constr(int num,String name){
		this.num = num;
		this.name = name;
	}
	public static void main(String[] args) {
		Constr c1 = new Constr(12,"pavan");
		Constr c2 = new Constr(13,"Rahul");
		System.out.println(c1.num+" "+c1.name);
		System.out.println(c2.num+" "+c2.name);

	}

}
