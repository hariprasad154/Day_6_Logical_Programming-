package Day6PracticeProblems;
import java.io.*;
public class PerfectNumber {
	static boolean isPerfect(int n)
	{
	    
	    int sum = 1;

	    for (int i = 2; i * i <= n; i++)
	    {
	        if (n % i==0)
	        {
	            if(i * i != n)
	                sum = sum + i + n / i;
	            else
	                sum = sum + i;
	        }
	    }
	    if (sum == n && n != 1)
	        return true;
	    return false;
	}
	public static void main(String[] args) {
		
		if(isPerfect(28)) {
			System.out.println(" is a perfect number");
		}else {
			System.out.println(" is not a perfect number");
		}
//		 for (int n = 2; n < 10000; n++)
//		        if (isPerfect(n))
//		            System.out.println( n +" is a perfect number");
	}

}
