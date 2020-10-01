package tutorial13_18_Classes;
class Frog {
	
	private String name;
	private int age;
	
	/*Setter method sets the instance variable of the class
	 * which allows us to encapsulate class data (make it private)
	 */
	public void setName(String name) {
		this.name = name; //this keyword is used similar to 'self' in python
	}
	
	//Setter method
	public void setAge(int age) {
		this.age = age;
	}
	
	//Setter method
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	//Getter method
	String getName() {
		return this.name;
	}
	
	//Getter method
	int getAge() {
		return this.age;
	}
	
	
	
}	


public class Tutorial_16_Setters {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		frog1.setName("Frank");
		frog1.setAge(3);
		
		Frog frog2 = new Frog();
		frog2.setInfo("Fran", 4);
		
		String name1 = frog1.getName();
		int age1 = frog1.getAge();
		
		String name2 = frog2.getName();
		int age2 = frog2.getAge();
		
		System.out.println("Frog 1 name: " + name1 + "\nFrog 1 age: " + age1);
		System.out.println("Frog 2 name: " + name2 + "\nFrog 2 age: " + age2);
	}

}
