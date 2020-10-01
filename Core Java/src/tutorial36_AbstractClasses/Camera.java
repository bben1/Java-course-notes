package tutorial36_AbstractClasses;

public class Camera extends Machine implements ExampleInterface{

	/* These abstract methods were declared in the parent class
	 * so they need to be defined in this child class
	 */
	
	public Camera() {
		refill();
		noise();
		timeLeft();
		interface_method_Price();
		interface_method_PurchaseDate();
		interface_method_RepairRequired();
	}
	//Methods that require to be implemented (abstract methods)
	@Override
	public void refill() {
		System.out.println("Charging the camera..");	
	}

	@Override
	public void noise() {
		System.out.println("Snap!");	
	}

	@Override
	public void timeLeft() {
		System.out.println("3 hours of battery remaining..");
	}

	//Methods that require to be implemented (from the interface)
	@Override
	public void interface_method_Price() {
		System.out.println("Price was £400");
		
	}

	@Override
	public void interface_method_PurchaseDate() {
		System.out.println("Purchase date was 1/1/19");
		
	}

	@Override
	public void interface_method_RepairRequired() {
		System.out.println("True");
		
	}

}
