package tutorial47_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesWithScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Creating a String object that contains the file path
		String fileName = "C:\\Users\\brook\\OneDrive\\Documents\\Desktop\\example.txt";
		
		//Creating a new file using the String object
		File textFile = new File(fileName);
		
		//Creating a Scanner object to read the file into the program
		Scanner in = new Scanner(textFile);
		
		//Creating a counter to keep track of the line number
		int lineCount = 0;
		
		while(in.hasNextLine()) {
			
			//At each line print out the next line
			System.out.println(lineCount + ": " + in.nextLine());
			//Increment the line count by 1
			lineCount++;
		}
		
		in.close();//Always close the scanner object
		
	}

}
