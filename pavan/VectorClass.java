package array.pavan;
import java.util.*;
public class VectorClass {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("java");
		v.add(10);
		v.add(10.23);
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next() + " ");
		}

	}

}
