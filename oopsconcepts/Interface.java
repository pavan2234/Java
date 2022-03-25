package org.oopsconcepts;
interface WaterBottle{
	String color = "Blue";
	void fillup();
}
public class Interface implements WaterBottle{

	public static void main(String[] args) {
		System.out.println(color);
		Interface ex = new Interface();
		ex.fillup();
	}

	@Override
	public void fillup() {
		System.out.println("It is filled");
		
	}

}
