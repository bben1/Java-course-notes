package tutorial27_29_GenericsAndCasting;
import java.util.ArrayList;
import java.util.HashMap;

public class tutorial_29_UsingGenerics {

	public static void main(String[] args) {
		
		//<String> means that the ArrayList object will contain Strings
		ArrayList<String> fruit = new ArrayList<>();
		
		fruit.add("apple");
		fruit.add("pear");
		fruit.add("banana");
		//list.add(4); returns an error because 4 is not of type string
		
		System.out.println(fruit);
		
		//<Integer, String> means that the HashMap fields will be of type int,String
		HashMap<Integer, String> animals = new HashMap<>();
		
		animals.put(1,"dog");
		animals.put(2,"cat");
		animals.put(3,"mouse");
		//animals.put("lion", 4); returns an error because it is of type <String, Integer> not <Integer, String>
		
		System.out.println(animals);
		
		
		

	}

}
