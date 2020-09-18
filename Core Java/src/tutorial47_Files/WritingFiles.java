package tutorial47_Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) {
		//Creating a new file using the File object
		File file = new File("newFile.txt");
		
		//Using try-with to create write the file into the program
		//try-with automatically closes BufferedWriter
		//using a BufferedWriter and FileWriter to write the file
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			//writing to the file
			br.write("New line 1");
			br.write("\nNew line 2");
			br.newLine();
			br.write("Final line");
		} 
		//Catch block to catch specific exceptions
		catch (IOException e) {
			System.out.println("Cannot write to the file");
			e.toString();
		}
	}

}
