
public class Tutorial_3_Strings {

	public static void main(String[] args) {
		
		String text = "Hello"; //String is a class and not a primitive data type so we use capital letter to start when declaring and initialising a string variable
		String blank = " ";
		String name = "Ben";
		String greeting = text + blank + name;
		int myInt = 7;
		double myDouble = 7.0;
		
		System.out.println("Hello" + " " + "Bob");//can directly add strings together
		System.out.println(greeting);//can add string variables together
		System.out.println("My integer is :" + 7);
		System.out.println("My integer is :" + myInt);
		System.out.println("My double is :" + myDouble);
		
		
		
	}

}
