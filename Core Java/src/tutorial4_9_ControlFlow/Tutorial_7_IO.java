package tutorial4_9_ControlFlow;
import java.util.Scanner;

public class Tutorial_7_IO {

	public static void main(String[] args) {
		
		Scanner input_variable = new Scanner(System.in); //Create a Scanner object
		
		System.out.println("Enter a line of text: "); //Asking user to enter a line of text
		
		String line = input_variable.nextLine(); //Wait for user to enter a string input
		
		System.out.println("Enter an integer value: "); // Asking user to enter an integer value
		
		int value = input_variable.nextInt(); //Wait for user to enter integer input
		
		input_variable.close(); // close the Scanner object
		
		System.out.println("You entered text: " + line + "\nYou entered integer: " + value);//summary
		
	}

}
