class Robot {
	
	String name;
	int age;
	
	void greet() {
		System.out.println("Hello there, I am a robot.");
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	public void speak(String text) {
		System.out.println("You have asked me to say: " + text);
	}
	
	public void yearsUntilFault(int lifespan) {
		int yearsLeft = lifespan - age;
		System.out.println("With a lifespan of " + lifespan + " I will fault in " + yearsLeft + " years.");
	}
}





public class Tutorial_15_MethodParameters {

	public static void main(String[] args) {
		
		Robot steve = new Robot();
		
		steve.name = "steve";
		steve.age = 5;
		
		steve.greet();
		int age = steve.getAge();
		String name = steve.getName();
		
		System.out.println("Name: " +name+"\nAge: "+age);
		
		steve.speak("Say anything");
		steve.yearsUntilFault(40);
		

	}

}
