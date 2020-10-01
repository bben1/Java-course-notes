package tutorial10_12_Arrays;

public class Tutorial_12_MultiDimensionalArrays {

	public static void main(String[] args) {
		
		/*Creating a two-dimensional array
		 * Use[][] notation
		 */
		int[][] values1 = {
				{1,2,3,4},
				{1,5,7},
				{7,9,3}
		};
		
		for(int i=0;i<values1.length;i++) {
			for(int j=0;j<values1[i].length;j++) {
				System.out.println(values1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("***********************");
		
		/*Creating a multidimensional matrix
		 * using for loops
		 */
		int[][] values2 = new int[3][4];
		
		for (int i=0;i<values2.length;i++) {
			for (int j=0; j<values2[i].length;j++) {
				values2[i][j] = i+j - i*j;//assigning integer values to each element
				System.out.print(values2[i][j]);
			}
			System.out.println();
		}
	}
}
