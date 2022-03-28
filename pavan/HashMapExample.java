package array.pavan;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
	Map<String,String> phonebook = new HashMap();
	phonebook.put("pavan", "9703562234");
	phonebook.put("Prashanth", "123456789");
	phonebook.put("pavan1", "9703562234");
	phonebook.put("Prashanth1", "123456789");
	phonebook.put("pavan2", "9703562234");
	phonebook.put("Prashanth2", "123456789");
	System.out.println(phonebook.get("pavan"));
		
System.out.println(phonebook);
	}

}
