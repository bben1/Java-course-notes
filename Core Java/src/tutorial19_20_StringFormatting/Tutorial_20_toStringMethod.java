package tutorial19_20_StringFormatting;
class Frog1 {
	
	String name;
	int id;
	
	public Frog1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return String.format("%s id: %-4d", name, id);
	}
}

public class Tutorial_20_toStringMethod {

	public static void main(String[] args) {
		
		Frog1 frog1 = new Frog1("Fred", 5);
		Frog1 frog2 = new Frog1("Frank", 3);
		
		//When we run System.out.println on an object it looks for toString method
		System.out.println(frog1);
		System.out.println(frog2);

	}

}
