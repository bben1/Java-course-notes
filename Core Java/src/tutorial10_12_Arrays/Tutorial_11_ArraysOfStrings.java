package tutorial10_12_Arrays;

public class Tutorial_11_ArraysOfStrings {

	public static void main(String[] args) {
		
		/*strings1 is a reference that points to an array of references to strings.
		 *each element in the array is a reference that points to a string in memory.
		 */
		String[] strings1 = new String[4]; 
		/*by default, if we do not allocate a string to a reference in the array,
		 *then the value of the reference becomes null (for integers it becomes 0 by default
		 */
		
		System.out.println(strings1[0]);
		
		/*We can also use a special type of for loop 
		 *to iterate through an array element by element.
		 */
		for(String i: strings1) {
			/*Setting each element to "abc" and then printing out each element.
			 *Notice how the value of the first element stays as null,
			 *This is because 
			 */
			i = "abc"; //setting each element of the string to "abc"
			System.out.println(i);//notice that the first element stays as null
		}

	}

}
