package tutorial21_inheritance;

public class Car extends Machine {//We write 'extends' to imply that Car inherits from Machine
	
	String brand;
	double mileage;
	double price;
	int age;
	
	public Car(String brand, double mileage, double price, int age) {
		this.brand = brand;
		this.mileage = mileage;
		this.price = price;
		this.age = age;
	}
	
	public void start() {//Overwriting the parent class method 'start()
		System.out.println("Car has started..");
	}
	
	public void madeIn(String country) {//a setter method that sets the instance variable for machine
		this.madeIn = country;
	}
	
}
