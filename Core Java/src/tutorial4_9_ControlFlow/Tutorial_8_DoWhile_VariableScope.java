package tutorial4_9_ControlFlow;
import java.util.Scanner; //import a Scanner object

public class Tutorial_8_DoWhile_VariableScope {

	public static void main(String[] args) {
		
		/*Variables are defined in the inner-most curly braces so must define 
		 * these variables before the do-while operations
		 */
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		
		do {
			System.out.println("Please enter an integer value between 1 and 10: ");
			value = scanner.nextInt();
		}
		
		while (value != 5);
		
		System.out.println("You got 5!");
		scanner.close();

	}

}
