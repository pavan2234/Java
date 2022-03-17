package org.techouts;

public class Constructor2 {
	int num;
	String name;
	Constructor2(String name,int num){
		this.name=name;
		this.num=num;
	}
	public static void main(String[] args) {
		Constructor2 s1 = new Constructor2("Pavan",1869);
		Constructor2 s2 = new Constructor2("Avinash",1870);
		System.out.println(s1.name+"-----"+s1.num);
		System.out.println(s2.name+"-----"+s2.num);

	}

}
