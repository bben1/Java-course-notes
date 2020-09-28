package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Person {
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	//Add the hashCode() and equals() methods to identify identical class instances
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class PassingObjectsToCollections {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Bob");
		Person p2 = new Person(2, "Barry");
		Person p3 = new Person(3, "Bill");
		Person p4 = new Person(1, "Bob");
		
		Map<Person, Integer> people1 = new LinkedHashMap<Person, Integer>();
		
		people1.put(p1, 1);
		people1.put(p2, 2);
		people1.put(p3, 3);
		people1.put(p4, 4);
		
		for(Person key: people1.keySet()) {
			System.out.println("Key: " + key + "\nValue " + people1.get(key));
		}
		
	}

	private static Object Person(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
