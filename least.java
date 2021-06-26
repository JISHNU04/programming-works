// Java program to find the least frequent element
// in an array.
import java.io.*;
import java.util.*;

class least {
	
	static int leastFrequent(int arr[], int n)
	{
		Arrays.sort(arr);
		int min_count = n+1, res = -1;
		int curr_count = 1;
		
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				curr_count++;
			else {
				if (curr_count < min_count) {
					min_count = curr_count;
					res = arr[i - 1];
				}
				
				curr_count = 1;
			}
		}
		if (curr_count < min_count)
		{
			min_count = curr_count;
			res = arr[n - 1];
		}
	
		return res;
	}

	public static void main(String args[])
	{
		int arr[] = {1, 3, 2, 1, 2, 2, 3, 1};
		int n = arr.length;
		System.out.print(leastFrequent(arr, n));
		
	}
}


