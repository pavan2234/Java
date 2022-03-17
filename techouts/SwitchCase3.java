package org.techouts;
import java.util.Scanner;
public class SwitchCase3 {

	public static void main(String[] args) {
		System.out.println("Enter the domain");
		Scanner sc = new Scanner(System.in);
		String domain = sc.nextLine();
		domain = domain.trim().toLowerCase();
		switch(domain) {
		case "us":
			System.out.println("United States");
		break;
		case "tg":
			System.out.println("Telangana");
		break;
		}
		
		
	}
}
