//5. Check if array contains contiguous integers with duplicates allowed 

//Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”. 


import java.util.*;

class demo {
    
		public static boolean cont(int arr[],int n)
	{
	// Sort the array
	Arrays.sort(arr);
	
	for (int i = 1; i < n; i++)
		if (arr[i] - arr[i-1] > 1)
			return false;
	
	return true;
	}

	public static void main(String[] args)
	{
		int arr[] = {5, 2, 3, 6, 4, 4, 6, 6};
		int n = arr.length;
		
		if (cont(arr, n))
			System.out.println("Yes");
		
		else
			System.out.println("No");
		
	}
	
}

