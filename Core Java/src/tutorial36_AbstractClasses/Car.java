package tutorial36_AbstractClasses;

public class Car extends Machine implements ExampleInterface{
	
	/* These abstract methods were declared in the parent class
	 * so they need to be defined in this child class
	 */
	
	public Car() {
		refill();
		noise();
		timeLeft();
		interface_method_Price();
		interface_method_PurchaseDate();
		interface_method_RepairRequired();
	}
	
	//Methods that are required to be implemented (abstract methods)
	@Override
	public void refill() {
		System.out.println("Filling the tank..");	
	}

	@Override
	public void noise() {
		System.out.println("Broom BROOM!");
	}

	@Override
	public void timeLeft() {
		System.out.println("30 miles left in tank..");
	}

	//Methods that are required to be implemented (from the interface)
	@Override
	public void interface_method_Price() {
		System.out.println("Price was £20000");
		
	}

	@Override
	public void interface_method_PurchaseDate() {
		System.out.println("Purchase date was 1/1/19");
		
	}

	@Override
	public void interface_method_RepairRequired() {
		System.out.println("False");
		
	}

}
