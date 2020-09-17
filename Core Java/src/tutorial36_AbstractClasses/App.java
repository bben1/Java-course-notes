package tutorial36_AbstractClasses;

public class App {

	public static void main(String Args[]) {
		
		/*The below code will return an error because Machine is an 'abstract' class.
		 *An abstract class is only there to define child classes
		 *and it is not meant to be implemented itself.
		 */
		//Machine mach1 = new Machine();
		//mach1.start();
		//mach1.stop();
		
		System.out.println("********************");
		Car car1 = new Car();
		
		System.out.println("********************");
		Camera cam1 = new Camera();
		
		/* Abstract classes work similarly to interfaces in that
		 * they outline functionality of a class and require the class to implement certain methods.
		 * But they are not the same thing.
		 * An interface defines what a class can do
		 * and you can use multiple interfaces when creating a class
		 * An abstract class defines what a child class is and can do
		 */
		
	}
	
}
