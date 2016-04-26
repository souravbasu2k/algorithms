package strings;

public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		String A = "acbaed";
		String B = "abcadf";
		
		//System.out.println(A.substring(0, A.length()-1));
		
		int max = LCS(A,B);
		System.out.println(max);		
	}
	
	public static int LCS(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		
		if(lenA==0 || lenB==0)
			return 0;
		
		if(A.charAt(lenA-1)==B.charAt(lenB-1)) {
			return 1+ LCS(A.substring(0, lenA-1), B.substring(0, lenB-1));
		} else {
			return Math.max(
					LCS(A.substring(0, lenA - 1), B),
					LCS(A, B.substring(0, lenB - 1)));
		}
	}

}
