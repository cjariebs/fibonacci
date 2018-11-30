public class Fibonacci {
	public static double fibRecursive(int n) {
		return (n <= 1) ? 1 : fibRecursive(n-1)+fibRecursive(n-2);
		// Ternary operator (?:) - if (n <= 1), return 1, else return fibo
	}

	public static double fibIterative(int n) {
		if (n <= 1) return 1;

		double a = 0;
		double b = 1;
		double c = 0;
	
		for (int i = 0; i < n; i++) {
			c = a+b;
			
			a = b;
			b = c;
		}

		return c;
	}		
		
	public static void main(String args[]) {
		int n = (args.length > 0) ? Integer.parseInt(args[0]) : 50; // Command-line argument
		
		System.out.println(fibIterative(n));
		System.out.println(fibRecursive(n));
	}
}		
		
