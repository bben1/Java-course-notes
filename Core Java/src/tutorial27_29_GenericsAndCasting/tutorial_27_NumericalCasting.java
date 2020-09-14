package tutorial27_29_GenericsAndCasting;

public class tutorial_27_NumericalCasting {
	
	public static void main(String[] Args) {
		
		//These values can all be cast to eachother if size permits
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		//These values can all be cast to eachother if size permits
		float floatValue = 8834.3f;
		double doubleValue = 32.4;
		
		//Finding the maximum size for a byte
		System.out.println(Byte.MAX_VALUE);
		
		//Casting the longValue to an integer
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		//Casting an integer to a double
		doubleValue = (double)intValue;
		System.out.println(doubleValue);
		
		//Casting a float to an integer (does not round, just removes the decimal places)
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//Casting a value that is too big to be a byte into a byte returns a negative number.
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}

}
