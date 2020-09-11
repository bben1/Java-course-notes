package tutorial10_12_Arrays;

public class Tutorial_10_Arrays {

	public static void main(String[] args) {
		
		/* Creating the array element by element
		 * using a for loop to print the elements
		 */
		int[] array1; // Declare the array
		array1 = new int[4]; // Initialise the array and point to memory with space for 4 integers
		
		array1[0] = 4;
		array1[1] = 6;
		array1[2] = 7;
		array1[3] = 9;
		
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
			array1[i] += 2;
			}
		
		/*creating the array
		 *printing the elements using a for loop (floats example)
		 */
		float[] array2 = new float[3]; // Or we could just declare and initialise on the same line
		
		for(int i=0; i<array2.length;i++) {
			array2[i] = i+5f/3f;
			System.out.println(array2[i]);
		}
		
		/*creating the array directly
		 *printing each element using a for loop (doubles example)
		 */
		double[] array3 = {5.0, 6.0, 9.0};
		
		for (int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		
	}
	
}
