package tutorial47_Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFilesTryWith {

	public static void main(String[] args) {
		
		//Define the fileName as a string and create a new file
		String fileName = "C:\\Users\\brook\\OneDrive\\Documents\\Desktop\\example.txt";
		File file = new File(fileName);
		
		//Using try-with to read the file into the program and read it with a buffer
		//without needing to close it afterwards
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			//Declaring a variable within the try scope for the line of the file
			String line;
			
			//Using a while loop to iterate through the string and print each line
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} 
		//Catch blocks to catch the different exceptions that could be thrown
		catch (FileNotFoundException e) {
			System.out.println("File not found " + fileName);
		}
		
		catch (IOException e) {
			System.out.println("Cannot read file " + fileName);
		}

	}
}
