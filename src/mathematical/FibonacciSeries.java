package mathematical;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int x = 4;
		System.out.println(getFibonacciIndex(x));
	}
	
	public static int getFibonacciIndex(int n) {
		int[] fib = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		
		int res = 0;
		for(int i=2; i<n; i++) {
			fib[i] = fib[i-2] + fib[i-1];
			res = fib[i];
		}
		
		return res;
	}
	
}
