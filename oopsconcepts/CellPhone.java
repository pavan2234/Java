package org.oopsconcepts;
class Name{
	public void contact(){
	System.out.println("Pavan");
	}
}
class contact1 extends Name{
	public void contact() {
	System.out.println("9703562234");
	}
}
class contact2 extends Name{
	public void contact() {
	System.out.println("6302619865");
	}
}
public class CellPhone {

	public void main(String[] args) {
		Name pavan = new Name();
		Name mycontact1 = new Name();
		Name mycontact2 = new Name();
		pavan.contact();
		mycontact1.contact();
		mycontact2.contact();
		//output not coming
		
		

	}

}
