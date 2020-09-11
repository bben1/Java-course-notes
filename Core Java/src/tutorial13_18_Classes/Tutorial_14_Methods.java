package tutorial13_18_Classes;
class Human {
	
	/*instance variables
	 * (or class data)
	 */
	String name;
	int age;
	
	/*The void keyword tells java not to return anything from the method.
	 *This method prints out the instance information but doesn't return anything.
	 */
	void Info() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	
	/*This method prints out a statement but does not return anything.
	 */
	void greet() {
		System.out.println("Hello there.");
	}
	
	/*This getter method returns an integer.
	 *In this case it returns the age of the instance.
	 */
	int getAge() {
		return age;
	}
	
	/*This getter method returns a string.
	 *In this case it returns the name of the instance.
	 */
	String getName() {
		return name;
	}
}

public class Tutorial_14_Methods {

	public static void main(String[] args) {
		
		Human person1 = new Human();
		person1.name = "Ben B";
		person1.age = 33;
		person1.greet();
		person1.Info();
		
		String name = person1.getName();
		int age = person1.getAge();
		
		System.out.print("person1 name is " + name + " and they are " + age + " years old.");
	}

}
