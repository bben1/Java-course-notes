package tutorial25_Polymorphism;

/*Polymorphism implies that a subclass can be used anywhere that the parent class is used.
 *In the example below, the Tree class is a subclass of the Plant.
 */
public class App {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		Plant plant2 = new Tree();
		
		plant1.grow();
		tree1.grow();
		
		plant2.grow();//uses the tree method because Tree is a subclass of Plant class

	}

}
