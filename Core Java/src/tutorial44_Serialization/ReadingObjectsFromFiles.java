package tutorial44_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjectsFromFiles {

	public static void main(String[] args) {
		
		//Using try-with block to use and then close the FileInputStream object
		try(FileInputStream fi = new FileInputStream("Peoplefile.bin")) {
			
			//Declaring an ObjectInputStream object
			//and passing the FileInputStream object as an argument
			ObjectInputStream os = new ObjectInputStream(fi);
			Person person1 = (Person)os.readObject();
			Person person2 = (Person)os.readObject();
			os.close();
			
			//Print out the objects.toString() to ensure that they have been serialized
			//Notice that the static counting variable that is incremented in the constructor
			//Is not being incremented which means that the constructor is not run when
			//We read in these serialized objects
			System.out.println(person1);
			System.out.println(person2);
			person1.showInfo();
			person2.showInfo();
			
		//Catch blocks
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
