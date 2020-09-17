package tutorial33_HandlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		/* Here the method openFile() is throwing out an Exception object
		 * Called FileNotFoundException
		 * Another way to handle an exception is to use a try-catch block
		 * As shown below, if an exception is thrown then the try block stops
		 * Getting executed at that point and an exception is thrown
		 * If the exception is caught by a catch block, 
		 * Then the code within that block runs, but if it is not caught by a catch block
		 * Then the code after the try-catch block run
		 * 
		 */
		try {
			System.out.println("Start of try-catch");
			openFile();
			System.out.println("This won't run because an exception is thrown above.");
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught in main!\nError message:");
			System.out.println(e.toString());
		}
		System.out.println("End of try-catch");

	}
	
	//One method of handling an exception is to include 'throws' Exception after the method name
	public static void openFile() throws FileNotFoundException {
		/*The below code throws a FileNotFoundException
		 * This means that the code is throwing out a certain Exception object
		 * Because this code is in a method which is run in main,
		 * The exception gets thrown into main() (it will also need to be handled there
		 */
		
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}

}

