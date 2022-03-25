package pavan.tasks;
import java.util.*;
class Mobile {
	void name()
	{
		System.out.println("61232348852");
		
	}

}
class Mobile2 extends Mobile
{
	void name()
	{
		super.name();
		System.out.println("7287884639");
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the contact Nmae :");
	String s= sc.nextLine();
	Mobile2 m=new Mobile2();
	m.name();
	
}
}
