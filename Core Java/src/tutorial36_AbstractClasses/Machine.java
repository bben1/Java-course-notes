package tutorial36_AbstractClasses;

abstract public class Machine {
	
	protected int id;
	
	public void start() {
		System.out.println("Machine starting..");
	}
	
	public void stop() {
		System.out.println("Machine stopping..");
	}
	
	public abstract void refill();
	public abstract void noise();
	public abstract void timeLeft();
	
}
