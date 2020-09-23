package Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		
		//Declaring a hashmap object we need to use generics for the key, value pairs
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		//Use the .put() method to add a new key-value pair
		hash.put(1, "Key value one");
		hash.put(2, "Key value two");
		hash.put(3,  "Key value three");
		
		//Use a for loop to print out the key value pairs
		for(Map.Entry<Integer, String> entry: hash.entrySet()) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("("+key + "," + value+")");
			
		}
		

	}

}
