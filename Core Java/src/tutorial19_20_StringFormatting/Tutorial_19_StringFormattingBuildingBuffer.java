package tutorial19_20_StringFormatting;

public class Tutorial_19_StringFormattingBuildingBuffer {

	public static void main(String[] args) {
		
		//String formatting (will be demonstrating all using a for loop)
		//must put \n at the end of the string otherwise it will just join horizontally
		
		System.out.println("**************************");
		/*%d is used to add integers into strings
		 * format is %nd
		 * 	where:
		 * 		n = number of character spaces before character (negative n does spaces after)
		 */
		System.out.println("FORMATTING WITH %d: \n");
		for (int i =0; i<5; i++) {
			System.out.printf("This is test number %4d for string formatting\n", i);
		}
		
		System.out.println("**************************");
		/*%f is used to add floats into strings
		 *	format is %n.xf
		 *		where:
		 *			n = number of character spaces before character (negative n does spaces after)
		 *			.x = number of decimal places
		 */
		System.out.println("FORMATTING WITH %f: \n");
		for (int i=0;i<5;i++) {
			System.out.printf("This is test number %-6.2f for string formatting\n", i/3f);
		}
		
		System.out.println("**************************");
		/*%s is used to add strings into strings
		 * 	format  is %ns
		 * 		where:
		 * 			n = number of character spaces before character (negative n does spaces after)
		 */
		System.out.println("**************************");
		for (int i=0;i<5;i++) {
			System.out.printf("This is test %10s %d for string formatting\n", "number", i);
		}
		
		
		
	

	}

}
