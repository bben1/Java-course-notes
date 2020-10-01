package tutorial2_UsingVariables;

public class Tutorial_2_UsingVariables {

	public static void main(String[] args) {
		
		int myNumber; //declaring a variable of type integer
		
		myNumber = 88; //initialising this variable
		
		int myOtherNumber = 39; //declaring and initialising a variable at the same time
		short myShort = 847; // creating a short variable (number < 32000) 32-bit
		long myLong = 9797; // creating a long variable (larger numbers) 64-bit
		
		double myDouble = 7.3451; // creating a double variable (extra precision)
		float myFloat = 423.5f; // creating a float variable (need to put f on end or it becomes a double)
		
		char myChar = 'y'; // creating a char variable (can use symbol characters)
		
		boolean myBoolean = true; // creating a boolean variable (can use boolean logic)
		
		byte myByte = 126; // an 8-bit number (can go up to 127)
		
		
		
		System.out.println(myOtherNumber);
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);

	}

}
