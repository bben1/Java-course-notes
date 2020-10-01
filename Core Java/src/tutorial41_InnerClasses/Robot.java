package tutorial41_InnerClasses;

//Creating a robot class
public class Robot {
	//Creating a class variable to be used in the inner classes
	private int id;
	
	//Creating an inner class called brain
    class Brain {
    	//Creating inner class methods
		public void charge() {
			System.out.println("Brain is charging..");
			System.out.println("..Brain is charged.");
		}
		private void activate() {
			System.out.println("Brain is activating..");
			System.out.println(".. Brain has activated.");
		}
	}
    
    //Creating a static inner class Battery (can be called off of Robot in main)
    static class Battery {
    	//Creating a method for the inner class
    	public void charge() {
    		System.out.println("Battery is charging.");
    	}
    }
		
    //Creating a method for the class Robot
	public void start() {
		
		System.out.println("Robot " + id + " is starting..");
		//Declaring a new object from the Brain inner class
		//and running the Brain methods in this class method
		Brain brain = new Brain();
		brain.charge();
		brain.activate();
		System.out.println("..Robot " + id + " has started.");
		
		//Creating a string variable inside this method (needs to be final
		//as it can't be accessed
		final String test = "test variable in scope";
		
		//Creating an inner class within this class method
		class Temp {
			
			String test2 = "inner class variable";
			
			public void doSomething() {
				System.out.println("Running method inside class inside method." + test);
				System.out.println("Robot id: " + id + " " + test2);
				
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
		
	}
