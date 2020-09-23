package Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class SortedMapsClass {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//A hashMap sorts the keys
		System.out.println("Hashmap");
		testMap(hashMap);
		System.out.println(hashMap.toString());
		
		//A treeMap sorts the keys
		System.out.println("TreeMap");
		testMap(treeMap);
		System.out.println(treeMap.toString());

		//A linkedHashMap
		System.out.println("LinkedHashMap");
		testMap(linkedHashMap);
		System.out.println(linkedHashMap.toString());
		
	}
	
	//Create a static method to run in main() that adds key value pairs to the maps
	public static void testMap(Map<Integer, String> map) {
		
		map.put(1,  "Cat");
		map.put(3,  "Dog");
		map.put(8,  "Hamster");
		map.put(6,  "Bird");
		map.put(4,  "Giraffe");
		map.put(2,  "Snail");
		map.put(7,  "Frog");
		map.put(5, "Fish");
		
	}

}
