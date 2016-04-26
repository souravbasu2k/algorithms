package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,1,6,2,4,3};
		Sort(arr);
	}
	
	public static void Sort(int[] a) {
		int i, j, temp, flag = 0;
		int n = a.length;

		for(i=0; i<n; i++)
		{
			for(j=0; j<n-i-1; j++)
			{
				if( a[j] > a[j+1])
				{
					flag = 1;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} 
			}
			if(flag==0) {
				break;
			}
		}

		System.out.println(Arrays.toString(a));
	}
}


