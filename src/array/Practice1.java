package array;

public class Practice1 {
	public static void main(String[] args) {
		int[] a = {-2, 1, 5, -3, -4, 2, -7, -8};
		
		int max_so_far = 0;
		int max_ending_here = 0;
		
		for(int i=0; i<a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			
			if(max_ending_here<0)
				max_ending_here = 0;
			if(max_so_far<max_ending_here)
				max_so_far = max_ending_here;
		}
		
		System.out.println(max_so_far);
		
		int[] b = {-2, -1, -5, -3, -4, -2, -7, -8};
		int res = findLargestContiguousSubarrayAllNegative(b);
		System.out.println(res);
	}
	
	public static int findLargestContiguousSubarrayAllNegative(int a[]) {
		int max_so_far = a[0];
		int max_ending_here = a[0];
		
		for(int i=1; i<a.length; i++) {
			max_ending_here = Math.max(a[i], max_ending_here+a[i]);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		 return max_so_far;
	}
}
