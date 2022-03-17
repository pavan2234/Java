package org.techouts;

public class SwitchCase2 {

	public static void main(String[] args) {
		int day=4;
		switch(day) {
		case 0:
			System.out.println("Monday");
		break;
		case 1:
			System.out.println("Tuesday");
		case 2:
			System.out.println("Wed");
		break;
		case 3:
			System.out.println("Thursday");
		case 4:
			System.out.println("friday");
		break;
		default:
			System.out.println(day);
		}

	}

}
