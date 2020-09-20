package tutorial44_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SavingObjectsToFiles {

	public static void main(String[] args) {
		
		Person person1 = new Person("Ben", 21);
		Person person2 = new Person("Charlie", 17);
	
	//Using try-with to use and close the FileOutputStream object
	try(FileOutputStream fs = new FileOutputStream("Peoplefile.bin")) {
		
		//Creating a new ObjectOutputStream object
		//adding objects to the file
		//and then closing the ObjectOutputStream object
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(person1);
		os.writeObject(person2);
		os.close();
		
	//Catch blocks
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
