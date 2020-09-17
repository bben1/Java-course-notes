package tutorial34_MultipleExceptions;

import java.io.IOException;
import java.text.ParseException;


public class Test {

	public void method1() throws IOException, ParseException {
		throw new IOException();
		//throw new ParseException("Error in command line",2);
	}
	
	public void method2() {
		try {
			throw new IOException();
		}
		/* Due to encapsulation and the fact that exceptions are objects
		 * You can catch the parent class of an Exception (e.g. Exception e)
		 * Or replace the catch block with the child class (e.g. IOException e)
		 * NOTE:
		 * The parent class will catch all the exceptions that the child class can
		 * But not vice versa
		 * Make sure to always order the child class before the parent class.
		 */
		catch (IOException e) {
			System.out.print("IOException is the child class of Exception\n");
			System.out.println("We should always put the catch block of the child class first.");
		}
		catch (Exception e) {
			System.out.println("Exception is the parent class of IOException\n");
			System.out.println("We should always put the catch block of the child class first.");
		}
		
	}
}
