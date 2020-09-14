package tutorial31_OtherClassTypes;

import tutorial25_Polymorphism.Plant;

class Machine {
	public void start() {
		System.out.println("Machine starting..");
	}
}

class Robot {

	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
class Human {

	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
	
}

interface example {
	public void showInfo();
}

public class tutorial31_AnonymousClasses {

	public static void main(String[] args) {
		
		/*instead of ; we use open brackets to define the anonymous class
		 * within this anonymous class Machine, I am overriding the existing start() method
		 * we can see that the overriden method is run instead of the original.
		 */
		Machine machine1 = new Machine() {
			@implement public void start() {
				System.out.println("Overriden method...");
			}
		};
		
		machine1.start();
		
		/*Can also use anonymous classes to create a class that does not yet exist.
		 * Below, I create a class Plant() and a method grow().
		 */
		Plant plant = new Plant() {
			@implement public void grow() {
				System.out.print("Plant is growing...");
			}
		};
		
		plant.grow();
		
		/*An example to demonstrate the difference between anonymous classes and interface.
		 */
		Robot robot1 = new Robot() {
			
			@override String name = "robot1";
			
			@override public void charge() {
				System.out.println("Robot is charging..");
			}
			
			@override public void showInfo() {
				System.out.printf("Robot name is %s", name);
			}
		};
		
		Human human1 = new Human() {
			
			@override String name = "human1";
			
			@override public void sleep() {
				System.out.println("Human is sleeping...");
			}
			
			@override public void showInfo() {
				System.out.printf("Human name is %s",name);
			}
			
		};
		
		robot1.showInfo();
		human1.showInfo();
		
	}
	
	/* Anonymous classes work similarly to interfaces in that
	 * they require you to override existing methods.
	 * But they are not the same thing.
	 * An interface defines what a class can do (a Person() and a Machine() can .showInfo())
	 * An anonymous class defines what a class is (a Person() can .eat() a Machine() can .refill() etc..)
	 */

}
