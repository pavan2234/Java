package org.techouts;

public class AndOperator {

	public static void main(String[] args) {
		int a=10,b=5,c=20;  
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);
		System.out.println(a<b&a++<c);//false & true = false 
		System.out.println(a);
	}

}
