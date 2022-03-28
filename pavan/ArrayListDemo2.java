package array.pavan;
import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		int n = 10;
		ArrayList<Integer> arrlist = new ArrayList<Integer>(n);
		for(int i=0;i<=n;i++) 
			arrlist.add(i);
			System.out.println(arrlist);
			arrlist.remove(6);
			System.out.println(arrlist);
			for(int i=0;i<=arrlist.size();i++) {
				System.out.print(arrlist.get(i)+ " ");
			}
			System.out.println(arrlist);
	}

}
