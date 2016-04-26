package array;

public class LargestSumContiguousSubarray {
	
	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int b[] = {-11, -2, -7, -3, -1};
		
		System.out.println(mxSubArrayModified(b, b.length));
	}
	
	public static int maxSubArraySum(int a[], int size)
	{
	    int max_so_far = 0, max_ending_here = 0;
	 
	    for (int i = 0; i < size; i++)
	    {
	        max_ending_here = max_ending_here + a[i];
	        if (max_ending_here < 0)
	            max_ending_here = 0;
	        if (max_so_far < max_ending_here)
	            max_so_far = max_ending_here;
	    }
	    return max_so_far;
	}
	
	public static int mxSubArrayModified(int a[], int size) {
		int max_ending_here = a[0];
		int max_so_far = a[0];
		
		for(int i=1; i<size; i++) {
			max_ending_here = Math.max(a[i], max_ending_here + a[i]);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		
		return max_so_far;
		
	}

}
