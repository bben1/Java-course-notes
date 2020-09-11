package tutorial4_9_ControlFlow;
import java.util.Scanner;

public class Tutorial_9_Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a command: ");
		String command = scanner.nextLine();
		
		switch(command) {
		
		case "Turn on":
			System.out.println("System turned on..");
			break;
		
		case "Turn off":
			System.out.println("System turned off..");
			break;
			
		case "Load":
		
			System.out.println("What would you like to load? ");
			String to_load = scanner.nextLine();
			switch(to_load) {
			
			case "Documents":
				System.out.println("Loading documents..");
				break;
			
			case "Pictures":
				System.out.println("Loading pictures..");
			
			case "Downloads":
				System.out.println("Loading downloads..");
			
			default:
				System.out.println("Command not recognised.");
				break;
			};
			break;
		
		default:
			System.out.println("Command not recognised.");
		}

	}

}
