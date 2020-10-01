package Tutorial24_PublicPrivateProtected;

//For a variable defined in a parent class:
//Regardless of public, private, protected, that variable is accessible within scope of parent class.
/*public variables -- accessible from anywhere in the same package
* 					  it is best practise to only make 'final' variables public as they can't be changed.
*/
//private variables -- only accessible within the scope of the parent class
//protected variables -- only accessible within the scope of sub-classes and parent class

public class Plant {
	
	private String species;
	public static final int id=101;
	protected String type;
	
	public Plant(String species, String type) {
		this.species = species;
		this.type = type;
	}
}
