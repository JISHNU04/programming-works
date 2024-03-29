// Java program to find sum of
// digits of a number until
// sum becomes single digit.
import java.util.*;

public class sum {
	
	static int digSum(int n)
	{
		int sum = 0;

		while (n > 0 || sum > 9)
		{
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		return sum;
    
	}
	

	public static void main(String argc[])
	{
		int n = 5;
		System.out.println(digSum(n));
        

	}
}

