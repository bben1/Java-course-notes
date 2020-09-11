package tutorial4_9_ControlFlow;

public class Tutorial_6_IfStatements {

	public static void main(String[] args) {
		
		for(int i=0;i<100;i++) {
			
			if(i%3==0 & i%2==0) {
				
				System.out.printf( "%d is divisible by both 2 and 3. \n", i);
				
			}
			else if(i%2==0) {
				
				System.out.printf( "%d is divisible by 2. \n", i);
				
			}
			
			else if(i%3==0) {
				
				System.out.printf( "%d is divisible by 3. \n", i);
			}
			
			else {
				System.out.printf( "%d is not divisible by 2 or 3. \n", i);
			}
			
		}

	}

}
