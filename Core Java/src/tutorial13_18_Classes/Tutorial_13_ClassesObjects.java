class Person {
	/*//This is a private class that we can then 
	 * use in the "main" method of the public class
	 */
	String surname;
	int age;
	
}

public class Tutorial_13_ClassesObjects {

	public static void main(String[] args) {
		
		Person ben = new Person();
		ben.surname = "brooker";
		ben.age = 21;
		
		Person charlie = new Person();
		charlie.surname = "brooker";
		charlie.age = 17;
		
		System.out.println(charlie.age);

	}

}
