package array.pavan;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> Countries = new ArrayList<String>();
		Countries.add("India");
		Countries.add("Australia");
		Countries.add("England");
		Iterator<String> i = Countries.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(Countries);
	}

}
