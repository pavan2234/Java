package array.pavan;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<Integer> rollno = new LinkedList<Integer>();
		rollno.add(10);
		rollno.add(20);
		rollno.add(30);
		rollno.add(40);
		rollno.add(50);
		rollno.add(60);
System.out.println(rollno);
		rollno.addFirst(0);
		System.out.println(rollno);
		rollno.addLast(70);
		System.out.println(rollno);
		rollno.removeFirst();
		System.out.println(rollno);
		rollno.removeLast();
		System.out.println(rollno);
		rollno.getFirst();
		System.out.println(rollno);
		rollno.getLast();
		System.out.println(rollno);
	}

}
