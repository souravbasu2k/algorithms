package mathematical;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number: ");
			System.out.println(checkPrimeImprovised(in.nextInt()));
		}*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = in.nextInt();
		System.out.println("Enter second number: ");
		int y = in.nextInt();
		
		while(y<=x) {
			System.out.println("Second number should be greater than the first");
			System.out.println("Enter second number: ");
			y = in.nextInt();
		}
		
		for(int i = x; i<=y; i++) {
			if(checkPrimeImprovised(i))
				System.out.print(i+ ", ");
		}
	}

	public static boolean checkPrime(int n) {
		boolean flag = true;
		
		if (n <= 1) {
			return false;
		}
		
		//for any input value we are looping it from 2 to n-1. Therefore worst case scenario is n-2 times looping (bcoz starting from 2).
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				flag = false;
				break;
			}				
		}
		return flag;
	}
	
	public static boolean checkPrimeImprovised(int n) {
		boolean flag = true;
		
		if (n <= 1) {
			return false;
	    }
		//for any input value we are looping it from 2 to sqrt(n). Therefore worst case scenario is sqrt(n)-1 times looping.
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				flag = false;
				break;
			}				
		}
		return flag;
	}
}
