package array.pavan;
import java.util.*;
public class HashMapExample2 {

	public static void main(String[] args) {
	Map<String,String> password = new HashMap();
	password.put("pavan", "b3t33r password=");
	password.put("prash", "wearefriends");
	password.put("ram", "ilovecricket");
	password.put("mohan", "iwatchmovies");
	password.put("balu", "iplaykabbadi=");
	password.put("tarak", "ieatmango");
	System.out.println(password);//prints all the elements in the hashmap
	System.out.println(password.keySet());//prints the keys
	System.out.println(password.values());//prints the values
	System.out.println(password.get("pavan"));//accesss the key
	for (String i : password.keySet()) {
		  System.out.println(i);
		}
	for (String i : password.keySet()) {
		  System.out.println("key: " + i + " value: " + password.get(i));
		}
	}

}
