package mathematical;

public class Factorial {
	
	public static void main(String[] args) {
		int x = 4;
		System.out.println(fact(x));
	}
	
	static int factorial(int n) {
		if(n<0) return -999;
		
		int res = 1;
		
		for(int i=1; i<=n; i++) {
			res = res * i;
		}
		
		return res;
	}
	
	static int fact(int n) {
		if(n<0) 
			return -999;		
		else if(n==0)
			return 1;
		
		else 
			return fact(n-1) * n;		
	}
	
	
}
