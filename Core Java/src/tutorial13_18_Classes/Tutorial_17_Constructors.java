class Machine {
	
	String name; 
	int age;
	boolean active;
	
	public Machine(String name, int age, boolean active) {
		this.name = name;
		this.age = age;
		this.active = active;
	}
	
	public void getInfo() {
		System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nActive? "+this.active);
	}
	
	
}
public class Tutorial_17_Constructors {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine("Robot",3,true);
		machine1.getInfo();

	}

}
