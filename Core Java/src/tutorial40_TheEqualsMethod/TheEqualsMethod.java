package tutorial40_TheEqualsMethod;


class Machine {
	private int id;
	private String brand;
	
	public Machine(int id, String brand) {
		System.out.println("Machine " + id + " created");
	}
	public void start() {
		System.out.println("Machine " + id + " is starting.");
	}
	//Implementing a method that will produce the hashcode of the object
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
		return result;
	}
	//Implementing a method that will compare if an object is equal to another
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}

public class TheEqualsMethod {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine(5,"BOB");
		Machine mach2 = new Machine(5,"BOB");
	
		/*The == syntax:
		 *Compares if two primitive objects are equal to eachother
		 *Compares if two non-primitive objects point to the same object.
		 *
		 *The .equals() method:
		 *Compares if two two objects are the same as one another 
		 *based on criteria labelled in the .equals() method above.
		 */
		
		System.out.println(mach1 == mach2);
		System.out.println(mach1.equals(mach2));
	}

}
