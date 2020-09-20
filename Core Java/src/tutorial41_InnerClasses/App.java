package tutorial41_InnerClasses;

public class App {

	public static void main(String[] args) {
		Robot robot1 = new Robot();
		System.out.println("********************");
		//Directly accessing the static Brain inner class
		//and then running one of its methods
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		System.out.println("********************");
		//Running a class method of Robot
		robot1.start();

	}

}
