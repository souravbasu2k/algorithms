package mathematical;

public class PowerFunction {
	public static void main(String[] args) {
		int result = pow(2,4);
		System.out.println(result);
	}
	
	public static int pow(int base, int exponent) {
		if(exponent == 0) 
			return 1;
	    //return base * pow(base, --exponent);
	    
	    int res = 1;
	    for(int i =0; i<exponent; i++) {
	    	res *= base;
	    }
	    return res;
		
		
	}

}
