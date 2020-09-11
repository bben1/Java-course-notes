package tutorial21;

public class App {

	public static void main(String[] args) {
		
		Car car1 = new Car("Mercedes", 20000.00, 30000.00, 10);
		car1.start();
		car1.stop();
		car1.madeIn("Germany");
		
		System.out.println("New car information: ");
		System.out.printf("Brand: %-4s\nPrice: £%-4.2f\nMileage: %-4.2f miles\nAge: %2d years",
				car1.brand, car1.price, car1.mileage, car1.age);

	}

}
