package strings;

public class CheckPalindrome {
	public static void main(String[] args) {
		String input = "abccba";
		System.out.println(check(input));
	}
	
	public static boolean check1(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		if(reverse.equals(str))
			return true;
		else
			return false;
	}
	
	public static boolean check(String str) {
		int length = str.length();
		int i;
		int begin = 0;
		int end = length - 1;
		int middle = (begin + end) / 2;
		
		for(i = begin; i<=middle; i++) {
			if(str.charAt(begin)==str.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}				
		}
		if(i==middle+1)
			return true;
		else
			return false;
	}

}
