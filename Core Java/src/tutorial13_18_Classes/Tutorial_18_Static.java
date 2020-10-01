package tutorial13_18_Classes;
class Thing {
	
	/*Creating instance variables
	 *(should usually be private and accessed using a get method):
	 */
	public String name;
	public int age;
	public int id;
	
	/*Creating class variables:
	 * static: the variable is available to the class regardless of the instance.
	 * final: is a class constant and cannot be changed (does not have to be public).
	 * 		  must initialize the 'final' variable upon declaration.
	 */
	public static int count;
	public final int constant = 101;
	
	/*Creating a constructor that assigns an id to each instance.
	 * and keeps track of the count of instances.
	 * ((If we do not specify the return type of a method then we put 'public')).
	 * ((constructors always start with a capital and have the same name as the class.
	 */
	
	public Thing(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = constant+count; //accessing the static variable to assign id to the instance.
		count++;
	}
	
	/*Creating a static method:
	 * This is a method that does not use any of the class data.
	 * In the below example, we are just using it to access the instances count.
	 * (Note that static methods cannot access instance variables but vice-versa is true)
	 */
	public static int instanceCount() {
		return count;
	}
	
	/*Creating a method that displays information about the instance
	 *
	 */
	public void getInfo() {
		System.out.println("New Thing instance\nname: "+name+"\nage: "+age+"\nID: "+id);
		System.out.println("Number of instances: " + instanceCount());
	}
}
public class Tutorial_18_Static {

	public static void main(String[] args) {
		
		//Create some instances of the Thing class and run the getInfo() method
		System.out.println("*********************");
		Thing thing1 = new Thing("thing1", 3);
		thing1.getInfo();
		System.out.println("*********************");
		Thing thing2 = new Thing("Thing2", 5);
		thing2.getInfo();
		System.out.println("*********************");
		Thing thing3 = new Thing("Thing3", 2);
		thing3.getInfo();
		System.out.println("*********************");

	}

}
