package tutorial42_Enum;

public class App {

	public static void main(String[] args) {
		//Declare an instance of the Animal Enum object
		Animal animal = Animal.CAT;
		
		//We can use a switch statement to see the Enum object in use.
		switch (animal) {
		case DOG:
			System.out.println("Dog Enum.");
			break;
		case CAT:
			System.out.println("Cat Enum.");
			break;
		case BIRD:
			System.out.println("Bird Enum.");
			break;
		default:
			break;
		}
		
		//to access the string name of the Enum object use .name()
		System.out.println(Animal.DOG.name());
		System.out.println(animal.name());

	}

}
