/* CEN 3024
 * Mod 5
 * Nova Robb
 */

public class CompareFibSequence {

	// Create recursive fib algorithm
	public static int recursiveFib(int n1, int n2, int num) {
		if (num < 0) {  // base cases: negative nums
			return -1;
		} else if (num <= 1) { // base cases: 0 or 1
				return n1 + n2;
		} else {
			 return recursiveFib(n2, n1 + n2, num - 1);
		}
	}

	// Create iterative fib algorithm
	public static void iterateFib(int num) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		for(int i = 2; i < num; i++ ) {		// Starts at 2	
			n3 = n1 + n2;
			n1 = n2; 	// n2 becomes the first number 
			n2 = n3; 	// n3 becomes the second number
		}
	} 
	
	public static void main(String[] args) {
		iterateFib(5); //initialize to prevent "java jitter"
		long startTime;
		long endTime;
		
		// Iterative tests
		startTime = System.nanoTime();
		iterateFib(5); 
		endTime = System.nanoTime() - startTime;
		System.out.println("The 5th fibonacci value iterated in " + endTime +  " nanoseconds.");

		startTime = System.nanoTime();
		iterateFib(30);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 30th fibonacci value iterated in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		iterateFib(55);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 55th fibonacci value iterated in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		iterateFib(80);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 80th fibonacci value iterated in " + endTime +  " nanoseconds.");
	
		System.out.println("======================================================");

		// Recursive tests	
		recursiveFib(0, 1, 5); //initialize to prevent "java jitter"
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 5);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 5th fibonacci value recursed in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 30);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 30th fibonacci value recursed in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 55);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 55th fibonacci value recursed in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 80);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 80th fibonacci value recursed in " + endTime +  " nanoseconds.");

	}

}
