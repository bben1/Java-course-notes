package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		
		//HashSet does not remember order or sort values
		Set<String> set1 = new HashSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("bird");
		
		System.out.println(set1);
		
		//LinkedHashSet remembers order of values
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set2.add(1);
		set2.add(2);
		set2.add(4);
		set2.add(3);

		System.out.println(set2);
		
		//TreeSet sorts values in order
		Set<Double> set3 = new TreeSet<Double>();
		
		set3.add(4.0);
		set3.add(5.6);
		set3.add(2.9);
		set3.add(1.4);
		
		System.out.println(set3);
		
		//////////// Iteration with sets //////////////
		
		System.out.println("*******Iteration with sets*********");
		for(String element: set1) {
			System.out.println(element);
		}
		
		for(int element: set2) {
			System.out.println(element);
		}
		
		for(double element: set3) {
			System.out.println(element);
		}
		
		//////////// Intersection between sets //////////////
		
		System.out.println("*******Intersection between sets*********");
		//Create a copy of set1 and add new values to it
		Set<String> intersection1 = new HashSet<String>(set1);
		
		intersection1.add("elephant");
		intersection1.add("snake");
		
		intersection1.retainAll(set1);
		
		System.out.println(intersection1);
		
		//////////// Difference between sets ////////////////
		
		System.out.println("*******Difference between sets*********");
		//Create a copy of set1 and add new values to it
		Set<String> difference1 = new HashSet<String>(set1);
		
		difference1.add("elephant");
		difference1.add("snake");
		
		difference1.removeAll(set1);
		
		System.out.println(difference1);
	

	}

}
